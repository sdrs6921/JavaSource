package p0407;

import java.util.Scanner;

public class Test3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// int x=3;
		//
		// if (x > 10) {
		// System.out.println("x�� 10���� ŭ");
		// } else {
		// System.out.println("x�� 10���� ũ�� �ʴ�.");
		// }
		//
		
		Scanner sc = new Scanner(System.in);
		//���� 1 ���� (0-100)�� �Է¹޾� �հ�(60�� �̻�), ���հ� ���
		System.out.print("����: ");
		int score = sc.nextInt();
		
		if (score <= 0 || score>= 100) {
			System.out.println("�߸��� ���� ���α׷� ����!");
		} else {
			if (score >= 60) {
				System.out.println("�հ��Դϴ�.");
			} else {
				System.out.println("���հ��Դϴ�.");
			}
		}
		
		//���� 2 ���� �Է¹޾� Ȧ�� ¦�� ���
		System.out.print("����:");
		int n = sc.nextInt();
		
		if (n % 2 == 0) {
			System.out.println("¦��");
		} else {
			System.out.println("Ȧ��");
		}
		
		sc.close();
	}

}
