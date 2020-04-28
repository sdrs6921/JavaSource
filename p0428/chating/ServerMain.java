package p0428.chating;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChatRoom room = new ChatRoom();
		
		try {
			ServerSocket ss = new ServerSocket(3333);
			System.out.println("서버 시작");
			
			while (true) {
				Socket socket = ss.accept();
				ChatThread th = new ChatThread(socket, room);
				room.addMember(th);
				th.start();
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
