package p0410;

import java.util.Scanner;

class StudentScore {
	String name;
	int[] score;
	float average;
	
	void setInfo(String n, int[] s) {
		name = n;
		score = s;
		
		for (int i = 1; i < 4; i++) {
			score[4] += score[i];
		}
		
		average = (float)score[4] / 3;
	}
	
	void printInfo() {
		System.out.print(name + "/");
		for (int i = 0; i < score.length; i++) {
			System.out.print(score[i] + "/");
		}
		System.out.println(average);
	}
}
public class StudentScoreManagementExample {
	
	static void input(Scanner sc, StudentScore s) {
		int[] a = new int [5];
		String[] title = {"num:", "kor:", "eng:", "math:"};
		System.out.print("name:");
		String name = sc.next();
		
		for (int i = 0; i < 4; i++) {
			System.out.print(title[i]);
			a[i] = sc.nextInt();
		}
		
		s.setInfo(name, a);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		StudentScore s1 = new StudentScore();
		input(sc, s1);
		StudentScore s2 = new StudentScore();
		input(sc, s2);
		StudentScore s3 = new StudentScore();
		input(sc, s3);
		
		s1.printInfo();
		s2.printInfo();
		s3.printInfo();
		
		
	}

}
