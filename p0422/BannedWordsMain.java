package p0422;

import java.util.Scanner;

public class BannedWordsMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String[] banWords = "�����,������,���޷�,�ɳ���,��å".split(",");
		
		System.out.println("�޼����� �Է��Ͻÿ�.");
		String message = sc.nextLine();
		
		for (String word : banWords) {
			if (message.contains(word)) {
				message = message.replace(word, "�߸���");
			}
		}
		
		System.out.println("message : " + message);
		sc.close();
	}

}
