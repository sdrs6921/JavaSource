package p0407;

import java.util.Scanner;

public class Test10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		int i = 1, num;
		
		while (i < 5) {
			System.out.println(i++);
		}
		
		Scanner sc = new Scanner(System.in);
		
		while (i != 0) {
			System.out.print("출력할 숫자 입력:");
			num = sc.nextInt();
			System.out.println("입력값:" + num);
			System.out.print("반복 멈추려면 0입력:");
			i = sc.nextInt();
		}
		
		i = 10;
		
		while (i < 5) {
			//0번 돌아감
			System.out.println(i++);
		}
		
		while (i > 0) {
			//무한 루프
			System.out.println(i);
		}
		
		while (true) {
			//무한 루프
		}
		
		
		for(;;) {
			
		}*/
		Scanner sc = new Scanner(System.in);
		System.out.print("점수:");
		int score = sc.nextInt();
		while (score < 0 || score > 100) {
			System.out.println("잘못된 값 입력");
			System.out.print("점수:");
			score = sc.nextInt();
		}
		
		if (score >= 90) {
			System.out.println("A");
		}else if (score >= 80) {
			System.out.println("B");
		}else if (score >= 70) {
			System.out.println("C");
		}else if (score >= 60) {
			System.out.println("D");
		}else {
			System.out.println("F");
		}
		
		sc.close();
	}

}
