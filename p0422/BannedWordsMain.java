package p0422;

import java.util.Scanner;

public class BannedWordsMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String[] banWords = "십장생,개나리,진달래,꽃놀이,산책".split(",");
		
		System.out.println("메세지를 입력하시오.");
		String message = sc.nextLine();
		
		for (String word : banWords) {
			if (message.contains(word)) {
				message = message.replace(word, "삐리리");
			}
		}
		
		System.out.println("message : " + message);
		sc.close();
	}

}
