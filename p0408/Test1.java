package p0408;

import java.util.Scanner;

public class Test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num;
		String str = "";
		Scanner sc = new Scanner(System.in);
		
		while (true) {
			System.out.println("출력할 숫자를 입력하라");
			num = sc.nextInt();
			System.out.println("입력값:" + num);
			System.out.println("멈추려면 stop을 입력하라");
			str=sc.next();
			if (str.equals("stop")) {
				break;
			}
		}
		sc.close();
	}

}
