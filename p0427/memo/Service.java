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
			System.out.println("Memo Directory 생성!");
			return true;
		} else {
			return false;
		}
	}

	public String mkFileName(Scanner sc) {
		String[] files = dir.list();// memo 폴더의 파일 목록을 읽어 files에 담는다.
		String fName = "";
		int i;
		do {
			System.out.print("파일명>>");
			fName = sc.next();// 쓰기에서 사용할 파일명 입력받음
			for (i = 0; i < files.length; i++) {
				if (fName.equals(files[i])) { // 중복확인
					System.out.println("중복된 파일명(1.파일명 다시입력 2.이어쓰기)>>");
					int m = sc.nextInt();
					if (m == 1) {// 다시입력
						break;
					} else if (m == 2) {// 이어쓰기
						cont = true; // 이어쓰기로 파일을 쓰겠다를 표시
						return fName; // 이어쓰기할 파일명
					}
				}
			}
			if (i == files.length) {
				return fName; // 새로쓸 파일명
			}

		} while (true);
	}

	public void readFile(Scanner sc) {
		// TODO Auto-generated method stub
		String[] files = dir.list(); // 읽을 파일 목록 저장
		for (int i = 0; i < files.length; i++) {// 읽을 파일 목록 출력. 배열의 인덱스도 같이 출력
			System.out.println((i + 1) + ". " + files[i]);
		}

		int num;
		do {
			System.out.print("읽을 파일 번호: (종료 하려면 -1)>>");
			num = sc.nextInt(); // 파일 선택
		} while (num < -1 || num > files.length);

		if (num == -1) {
			return;
		}

		try {

			// 선택한 파일에서 문자 단위로 읽을 수 있는 스트림 생성
			BufferedReader br = new BufferedReader(new FileReader(path + files[num - 1]));
			while ((num = br.read()) != -1) {// 파일의 끝을 만날때까지 1바이트씩 읽어서 i에 저장
				System.out.print((char) num);// 읽은 i를 콘솔에 출력
			}
			br.close();// 스트림 닫는다.
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
			System.out.println("내용을 입력해주세요 (종료:/stop)");
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
			System.out.println("파일이 없습니다.");
			return;
		}

		for (int i = 0; i < files.length; i++) {
			System.out.println((i + 1)  + "."+ files[i]);
		}

		System.out.print("삭제할 파일을 선택하시오>>");
		int num = sc.nextInt();

		if (num < 0 || num > files.length) {
			System.out.println("잘못된 번호입니다.");
		}
		
		File file = new File(path + files[num - 1]);
		file.delete();
		System.out.println(files[num - 1] + "이 삭제되었습니다.");
	}
}
