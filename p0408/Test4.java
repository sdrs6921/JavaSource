package p0408;

import java.util.Scanner;

public class Test4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// String name;
		// int score[] = new int[4];
		// float average;
		// Scanner sc = new Scanner(System.in);
		//
		// System.out.print("�̸�:");
		// name = sc.nextLine();
		// System.out.print("��������:");
		// score[0] = sc.nextInt();
		// System.out.print("��������:");
		// score[1] = sc.nextInt();
		// System.out.print("��������:");
		// score[2] = sc.nextInt();
		//
		// for (int i = 0; i < score.length-1; i++) {
		// score[3] += score[i];
		// }
		//
		// average = (float)score[3] / (score.length-1);
		//
		// System.out.println("�̸�:" + name);
		// System.out.println("����:" + score[0]);
		// System.out.println("����:" + score[1]);
		// System.out.println("����:" + score[2]);
		// System.out.println("����:" + score[3]);
		// System.out.println("���:" + average);
		
		String name;
		String[] list = {"num", "kor", "eng", "math", "total"};
		int[] score = new int[5];
		float avg;
		Scanner sc = new Scanner(System.in);
		
		System.out.print("�̸�:");
		name = sc.nextLine();
		
		for (int i = 0; i < list.length - 1; i++) {
			System.out.print(list[i] + ":");
			score[i] = sc.nextInt();
		}
		
		for (int i = 1; i < list.length - 1; i++) {
			score[4] += score[i];
		}
		
		avg = (float)score[4] / score.length-2;
		
		System.out.println("name:" + name);
		for (int i = 0; i < score.length; i++) {
			System.out.print(list[i] + ":" + score[i] + "\n");
		}
		System.out.println("average:" + avg);
		sc.close();
	}

}
