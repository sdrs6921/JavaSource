package p0407;

import java.util.Scanner;

public class Test3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// int x=3;
		//
		// if (x > 10) {
		// System.out.println("x는 10보다 큼");
		// } else {
		// System.out.println("x는 10보다 크지 않다.");
		// }
		//
		
		Scanner sc = new Scanner(System.in);
		//문제 1 점수 (0-100)을 입력받아 합격(60점 이상), 불합격 출력
		System.out.print("점수: ");
		int score = sc.nextInt();
		
		if (score <= 0 || score>= 100) {
			System.out.println("잘못된 점수 프로그램 종료!");
		} else {
			if (score >= 60) {
				System.out.println("합격입니다.");
			} else {
				System.out.println("불합격입니다.");
			}
		}
		
		//문제 2 정수 입력받아 홀수 짝수 출력
		System.out.print("정수:");
		int n = sc.nextInt();
		
		if (n % 2 == 0) {
			System.out.println("짝수");
		} else {
			System.out.println("홀수");
		}
		
		sc.close();
	}

}
