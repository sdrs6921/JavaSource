package p0427;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Arrays;

public class FileReadExmapleMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int ch;
		byte[] arr = new byte[5];
		
		try {
			FileInputStream fi = new FileInputStream("src/p0427/files/a.txt");
			BufferedInputStream bi = new BufferedInputStream(fi);
			
			while ((ch = bi.read()) != -1) {
				//-1 : EOF�� �ǹ� (File�� ��)
				System.out.print((char)ch);	
			}
			System.out.println();
			
			bi.close();
			fi.close();
			
			fi = new FileInputStream("src/p0427/files/a.txt");
			
			
			while (true) {
				if (fi.available() < arr.length) {
					//p1 ä�� �迭, p2 ä�� ���� ��ġ, p3 ������ ��ġ p4 ä�� ��
					Arrays.fill(arr, 0, arr.length, (byte)0);
				}
				
				if (fi.read(arr) == -1) {
					break;
				}
				System.out.println(new String(arr));
			}
			
			fi.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
