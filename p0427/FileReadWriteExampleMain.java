package p0427;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileReadWriteExampleMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String path = "src/p0427/files/c.txt";
		
		try {
			//문자 단위(2바이트)씩 읽고 쓰는 스트림
			FileWriter fw = new FileWriter(path);
			FileReader fr = new FileReader("src/p0427/files/b.txt");
			
			//보조 스트림
			BufferedWriter bw = new BufferedWriter(fw);
			BufferedReader br = new BufferedReader(fr);
			
			int ch;
			while ((ch = br.read()) != -1) {
				bw.write(ch);
			}
			
			bw.close();
			br.close();
			fw.close();
			fr.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
