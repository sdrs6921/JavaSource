package p0407;

import java.util.Scanner;

public class Test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Scanner class를 이용한 입력 -> 훨씬 쉽고 간편
		Scanner sc = new Scanner(System.in);
		System.out.print("번호:");
		int num = sc.nextInt();
		System.out.print("이름:");
		String name = sc.next();
		System.out.print("키:");
		float height = sc.nextFloat();
		System.out.print("주소:");
		sc.nextLine();
		String address = sc.nextLine();
		
		
		System.out.println("num: " + num);
		System.out.println("name: " + name);
		System.out.println("height: " + height);
		System.out.println("address: " + address);
		
		sc.close();
		// 표준 입력
		// try {
		// //program이 중단되지 않게
		// int a = System.in.read();
		// System.out.println((char)a);
		// } catch (IOException e) {
		// // TODO Auto-generated catch block
		// e.printStackTrace();
		// }
		//
		// // int a = 10, b = 20;
		// // Short - circuit의 원리 69p
		// // boolean flag = (a >= 10 && b > 20);
		// // System.out.println(flag);
	}

}
