package p0407;

import java.util.Scanner;

public class Test4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//int x = 3;

		// �� ���� �پ��� �� ���.
		// �����ϴ� ���Ǻ���� ������ �� ��ϸ� �����ϰ� if-else�� ����
		// if (x == 1) {
		// System.out.println("x�� 1");
		// } else if (x == 2) {
		// System.out.println("x�� 2");
		// } else if (x == 3) {
		// System.out.println("x�� 3");
		// } else {
		// System.out.println("�̿��� ��");
		// }
		//
		// System.out.println("������ ����");

		// ���� 0-100�� �Է¹޾� ���� ���
		Scanner sc = new Scanner(System.in);
		System.out.print("����:");
		int score = sc.nextInt();
		//
		// if (score < 0 || score >= 100) {
		// System.out.println("�߸��� ����. ���α׷� ����");
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
			System.out.println("�߸��� �Է�. ���α׷� ����");
		}

		sc.close();
	}

}
