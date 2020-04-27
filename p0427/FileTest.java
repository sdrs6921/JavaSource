package p0427;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File file = new File("src/p0427/files/fileTest.txt");
		
		if (!file.exists()) {
			System.out.println("New File Created!!");
			try {
				file.createNewFile();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		BufferedReader br = null;
		BufferedWriter bw = null;
		
		try {
			br = new BufferedReader(new FileReader(file));
			bw = new BufferedWriter(new FileWriter(file)); 
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		int ch;
		String path = file.getPath();
		System.out.println("path:" + path);
		
		if (file.canWrite()) {
			System.out.println("���� ���� ����");
			try {
				bw.write("hello");
				bw.flush();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		if (file.canRead()) {
			System.out.println("�б� ���� ����");
			try {
				while ((ch = br.read()) != -1) {
					System.out.println((char) ch);
				}
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		if (file.canExecute()) {
			System.out.println("���� ���� ����");
		}
		
		if (file.isFile()) {
			System.out.println("�����Դϴ�.");
		}
		
		if (file.isHidden()) {
			System.out.println("���� �Ӽ�");
		}
		
		long size = file.length();
		System.out.println("���� ũ�� : " + size);
		System.out.println(path + "������ �����մϴ�.");
		
		File dir = new File("src/p0427/files");
		
		if (!dir.exists()) {
			System.out.println("���͸� ����");
			dir.mkdir();
		}
		
		String[] fileNames = dir.list();
		System.out.println("���� ���");
		
		for (ch = 0; ch < fileNames.length; ch++) {
			System.out.println(fileNames[ch]);
		}
		
		try {
			br.close();
			bw.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
