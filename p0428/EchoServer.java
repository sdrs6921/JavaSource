package p0428;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

//클라이언트 1명에 쓰레드 1개
class EchoServerTh extends Thread {
	private Socket socket;

	public EchoServerTh(Socket socket) {
		this.socket = socket;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		try {
			InputStream is = socket.getInputStream();
			InputStreamReader ir = new InputStreamReader(is);
			BufferedReader br = new BufferedReader(ir);
			PrintWriter out = new PrintWriter(socket.getOutputStream(), true);
			while (true) {
				String str = br.readLine();// 클라이언트가 보낸 메시지 한줄 읽음			
				System.out.println("클라이언트 메시지:" + str);
				out.println(str + "\n");// 클라이언트가 보낸 메시지를 다시 클라이언트에게 보냄
				if(str.startsWith("/stop")){
					break;
				}
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}

public class EchoServer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			ServerSocket ss = new ServerSocket(3333);// 서버소켓오픈. 파라메터는 포트번호
			System.out.println("서버시작");
			while (true) {
				Socket socket = ss.accept();// 클라이언트 접속 기다리다 요청수락. 수락후 이 클라이언트와
											// 1:1통신할 소켓 반환
				System.out.println("클라이언트 접속");
				new EchoServerTh(socket).start();
			}

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
