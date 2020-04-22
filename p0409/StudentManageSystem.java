package p0409;

import java.util.Scanner;

class Student {
	String name;
	int num, kor, eng,math, total;
	float avg;
	
	
	void setStudentInfo(String nm, int n, int k, int e, int m) {
		num = n;
		name = nm;
		kor = k;
		eng = e;
		math = m;
		total = (k + e + m);
		avg = (float)total / 3;
	}
	
	void printInfo() {
		System.out.println("name:" + name);
		System.out.println("num:" + num);
		System.out.println("kor:" + kor);
		System.out.println("eng:" + eng);
		System.out.println("math:" + math);
		System.out.println("total:" + total);
	}
	
}

public class StudentManageSystem {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Student s1 = new Student();
		
		System.out.print("name:");
		s1.name = sc.next();
		System.out.print("num:");
		s1.num = sc.nextInt();
		System.out.print("kor:");
		s1.kor = sc.nextInt();
		System.out.print("eng:");
		s1.eng = sc.nextInt();
		System.out.print("math:");
		s1.math = sc.nextInt();
		s1.total = (s1.kor + s1.eng + s1.math);
		s1.avg = s1.total / 3;
		
		System.out.println("name:" + s1.name);
		System.out.println("num:" + s1.num);
		System.out.println("kor:" + s1.kor);
		System.out.println("eng:" + s1.eng);
		System.out.println("math:" + s1.math);
		System.out.println("total:" + s1.total);
		System.out.println("avg" + s1.avg);
		
		sc.close();
	}

}
