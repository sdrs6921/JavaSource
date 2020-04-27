package p0427;

import java.io.BufferedOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileWriteExampleMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			//파일에 바이트 단위로 쓰는 스트림. 생성자 파일 경로 지정.
			FileOutputStream fo = new FileOutputStream("src/p0427/files/b.txt");
			BufferedOutputStream bo = new BufferedOutputStream(fo);
			int ch;
			
			while ((ch = System.in.read()) != '\n') {
				System.out.print((char) ch);
				bo.write(ch);
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
