package p0428;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

class Keyboard extends Thread {

	@Override
	public void run() {
		// TODO Auto-generated method stub
		String str = "";
		Scanner sc = new Scanner(System.in);
		
		while (!str.startsWith("/stop")) {
			str = sc.nextLine();
			System.out.println(str);
			try {
				sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		sc.close();
		System.out.println("입출력 쓰레드 종료");
	}

}

class FileRead extends Thread {

	@Override
	public void run() {
		// TODO Auto-generated method stub
		String path = "src/p0428/files/test.txt";
		try {
			FileInputStream fi = new FileInputStream(path);
			BufferedInputStream br = new BufferedInputStream(fi);
			
			int ch;
			
			while ((ch = br.read()) != -1) {
				System.out.print((char) ch);
				if (ch == '\n') {
					sleep(1000);
				}
			}
			
			br.close();
			System.out.println("파일 쓰레드 읽기 종료");
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}

public class ThreadExample2Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 1. 무한 루프 돌면서 키보드 입력받아 콘솔에 출력
		// 2. 파일을 하나 오픈해서 파일의 끝까지 한줄씩 읽어서 콘솔에 출격
		FileRead f = new FileRead();
		Keyboard k = new Keyboard();
		
		k.start();
		f.start();
		
	}

}
