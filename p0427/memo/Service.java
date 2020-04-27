package p0427.memo;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Service {
	private String path;
	private File dir;
	private boolean cont = false;

	public Service() {
		this.path = "src/p0427/memo/memo/";
		dir = new File(path);
	}

	public boolean mkDir() {
		if (!dir.exists()) {
			dir.mkdir();
			System.out.println("Memo Directory ����!");
			return true;
		} else {
			return false;
		}
	}

	public String mkFileName(Scanner sc) {
		String[] files = dir.list();// memo ������ ���� ����� �о� files�� ��´�.
		String fName = "";
		int i;
		do {
			System.out.print("���ϸ�>>");
			fName = sc.next();// ���⿡�� ����� ���ϸ� �Է¹���
			for (i = 0; i < files.length; i++) {
				if (fName.equals(files[i])) { // �ߺ�Ȯ��
					System.out.println("�ߺ��� ���ϸ�(1.���ϸ� �ٽ��Է� 2.�̾��)>>");
					int m = sc.nextInt();
					if (m == 1) {// �ٽ��Է�
						break;
					} else if (m == 2) {// �̾��
						cont = true; // �̾��� ������ ���ڴٸ� ǥ��
						return fName; // �̾���� ���ϸ�
					}
				}
			}
			if (i == files.length) {
				return fName; // ���ξ� ���ϸ�
			}

		} while (true);
	}

	public void readFile(Scanner sc) {
		// TODO Auto-generated method stub
		String[] files = dir.list(); // ���� ���� ��� ����
		for (int i = 0; i < files.length; i++) {// ���� ���� ��� ���. �迭�� �ε����� ���� ���
			System.out.println((i + 1) + ". " + files[i]);
		}

		int num;
		do {
			System.out.print("���� ���� ��ȣ: (���� �Ϸ��� -1)>>");
			num = sc.nextInt(); // ���� ����
		} while (num < -1 || num > files.length);

		if (num == -1) {
			return;
		}

		try {

			// ������ ���Ͽ��� ���� ������ ���� �� �ִ� ��Ʈ�� ����
			BufferedReader br = new BufferedReader(new FileReader(path + files[num - 1]));
			while ((num = br.read()) != -1) {// ������ ���� ���������� 1����Ʈ�� �о i�� ����
				System.out.print((char) num);// ���� i�� �ֿܼ� ���
			}
			br.close();// ��Ʈ�� �ݴ´�.
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void writeFile(Scanner sc) {
		cont = false;
		String fName = mkFileName(sc);
		String str = "";

		try {
			BufferedWriter bw = new BufferedWriter(new FileWriter(path + fName, cont));
			System.out.println("������ �Է����ּ��� (����:/stop)");
			while (!str.startsWith("/stop")) {
				str = sc.nextLine();
				bw.write(str + "\n");

				if (!str.startsWith("/stop")) {
					bw.write(str);
				}
			}

			bw.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void delFile(Scanner sc) {
		String[] files = dir.list();

		if (files.length <= 0) {
			System.out.println("������ �����ϴ�.");
			return;
		}

		for (int i = 0; i < files.length; i++) {
			System.out.println((i + 1)  + "."+ files[i]);
		}

		System.out.print("������ ������ �����Ͻÿ�>>");
		int num = sc.nextInt();

		if (num < 0 || num > files.length) {
			System.out.println("�߸��� ��ȣ�Դϴ�.");
		}
		
		File file = new File(path + files[num - 1]);
		file.delete();
		System.out.println(files[num - 1] + "�� �����Ǿ����ϴ�.");
	}
}
