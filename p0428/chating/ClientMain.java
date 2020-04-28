package p0428.chating;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

class ClientThread extends Thread {
	private Socket socket;
	private BufferedReader br;

	public ClientThread(Socket socket) {
		this.socket = socket;
		try {
			br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		while (true) {
			String msg;
			try {
				msg = br.readLine();
				System.out.println(msg);

				if (msg.startsWith("/stop")) {
					socket.close();
					break;
				}
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}
	}

}

public class ClientMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		try {
			Socket socket = new Socket("localhost", 3333);
			ClientThread th = new ClientThread(socket);
			th.start();
			PrintWriter out = new PrintWriter(socket.getOutputStream(), true);
			String str = "";
			
			while (true) {
				System.out.print("msg>>");
				str = sc.next();
				out.println(str);
				
				if (str.startsWith("/stop")) {
					break;
				}
			}
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
