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
			System.out.print("����� ���� �Է�:");
			num = sc.nextInt();
			System.out.println("�Է°�:" + num);
			System.out.print("�ݺ� ���߷��� 0�Է�:");
			i = sc.nextInt();
		}
		
		i = 10;
		
		while (i < 5) {
			//0�� ���ư�
			System.out.println(i++);
		}
		
		while (i > 0) {
			//���� ����
			System.out.println(i);
		}
		
		while (true) {
			//���� ����
		}
		
		
		for(;;) {
			
		}*/
		Scanner sc = new Scanner(System.in);
		System.out.print("����:");
		int score = sc.nextInt();
		while (score < 0 || score > 100) {
			System.out.println("�߸��� �� �Է�");
			System.out.print("����:");
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
