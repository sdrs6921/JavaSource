package p0407;

import java.util.Scanner;

public class Test4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//int x = 3;

		// 비교 값이 다양할 때 사용.
		// 만족하는 조건블록을 만나면 그 블록만 실행하고 if-else문 끝냄
		// if (x == 1) {
		// System.out.println("x는 1");
		// } else if (x == 2) {
		// System.out.println("x는 2");
		// } else if (x == 3) {
		// System.out.println("x는 3");
		// } else {
		// System.out.println("이외의 값");
		// }
		//
		// System.out.println("무조건 실행");

		// 문제 0-100을 입력받아 학접 출력
		Scanner sc = new Scanner(System.in);
		System.out.print("점수:");
		int score = sc.nextInt();
		//
		// if (score < 0 || score >= 100) {
		// System.out.println("잘못된 점수. 프로그램 종료");
		// } else {
		// if (score >= 90) {
		// System.out.println("A");
		// } else if (score >= 80) {
		// System.out.println("B");
		// } else if (score >= 70) {
		// System.out.println("C");
		// } else if (score >= 60) {
		// System.out.println("D");
		// } else {
		// System.out.println("F");
		// }
		// }
		
		if (score <= 100 && score >= 90) {
			System.out.println("A");
		} else if (score < 90 && score >= 80) {
			System.out.println("B");
		} else if (score < 80 && score >= 70) {
			System.out.println("C");
		} else if (score < 70 && score >= 60) {
			System.out.println("D");
		} else if (score <= 60 && score >= 0) {
			System.out.println("F");
		} else {
			System.out.println("잘못된 입력. 프로그램 종료");
		}

		sc.close();
	}

}
