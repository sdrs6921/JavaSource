package p0428.chating;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

public class ChatThread extends Thread {
	private Socket socket;
	private BufferedReader br;
	private PrintWriter out;
	private ChatRoom room;

	public ChatThread(Socket socket, ChatRoom room) {
		super();
		this.socket = socket;
		this.room = room;

		try {
			br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			out = new PrintWriter(socket.getOutputStream(), true);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		String id = socket.getInetAddress().getHostName();
		room.sendMsgAll("[" + id + "]���� ���Խ��ϴ�.");
		while (true) {
			String str;
			try {
				str = br.readLine();
				if (str.startsWith("/stop")) {
					sendMsg(str);
					room.deleteMember(this);
					room.sendMsgAll("[" + id + "]���� �����̽��ϴ�.");
					break;
				}
				room.sendMsgAll("[" + id + "] " + str);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

	public void sendMsg(String msg) {
		//����� Ŭ���̾�Ʈ 1���� �޼��� ����
		out.println(msg);
	}
}
