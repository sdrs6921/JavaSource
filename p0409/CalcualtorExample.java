package p0409;

import java.util.Scanner;

public class CalcualtorExample {
	static boolean flag = true;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1, num2;
		String opt;
		Scanner sc = new Scanner(System.in);	
		int res = 0;
		System.out.print("입력 (ex 4 + 5):");
		num1 = sc.nextInt();
		opt = sc.next();
		num2 = sc.nextInt();

		switch (opt) {
		case "+":
			res = add(num1, num2);
			break;
		case "-":
			res = sub(num1, num2);
			break;
		case "*":
			res = mult(num1, num1);
			break;
		case "/":
			res = div(num1, num2);
			break;
		default:
			System.out.println("잘 못 입력하셨습니다.");
			break;
		}
		if (flag) {
			System.out.println(res);
		}
		
		sc.close();
	}

	static int add(int num1, int num2) {
		return num1 + num2;
	}

	static int sub(int num1, int num2) {
		return num1 - num2;
	}

	static int mult(int num1, int num2) {
		return num1 * num2;
	}

	static int  div(int num1, int num2) {
		if (num2 == 0) {
			flag = false;
			System.out.println("0으로 나눌 수 없음.");
			return -1;
		}
		return num1 / num2;
	}
}
