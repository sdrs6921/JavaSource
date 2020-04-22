package p0410;

import java.util.Scanner;

class Student {
	String name;
	int num, kor, eng, math, total;
	float avg;

	void setInfo(String nm, int n, int k, int e, int m) {//한 학생의 정보를 파라메터로 받아 멤버변수에 할당
		name = nm;
		num = n;
		kor = k;
		eng = e;
		math = m;
		total = kor + eng + math;
		avg = (float) total / 3;
	}
	
	void printInfo(){//한 학생의 정보 출력
		System.out.println("name:" + name);
		System.out.println("num:" + num);
		System.out.println("kor:" + kor);
		System.out.println("eng:" + eng);
		System.out.println("math:" + math);
		System.out.println("total:" + total);
		System.out.println("avg:" + avg);
		System.out.println("=================");
	}
}

public class StudentMain {

	static void input(Student s, Scanner sc){//키보드 입력함수
		System.out.print("name:");
		String name = sc.next();
		System.out.print("num:");
		int num = sc.nextInt();
		System.out.print("kor:");
		int kor = sc.nextInt();
		System.out.print("eng:");
		int eng = sc.nextInt();
		System.out.print("math:");
		int math = sc.nextInt();
		s.setInfo(name, num, kor, eng, math);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Student s1 = new Student();
		input(s1, sc);
		Student s2 = new Student();
		input(s2, sc);
		Student s3 = new Student();
		input(s3, sc);
		s1.printInfo();
		s2.printInfo();
		s3.printInfo();
	}

}
