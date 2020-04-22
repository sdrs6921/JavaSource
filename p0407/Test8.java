package p0407;

import java.util.Scanner;

public class Test8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int num1, num2, result = 0;
		boolean flag = true;
		String operator;

		System.out.print("숫자 2개 입력:");
		num1 = sc.nextInt();
		num2 = sc.nextInt();
		System.out.print("연산자:");
		operator = sc.next();

		switch (operator) {
		case "+":
			result = num1 + num2;
			break;
		case "-":
			result = num1 - num2;
			break;
		case "*":
			result = num1 * num2;
			break;
		case "/":
			if (num2 == 0) {
				System.out.println("0으로 나눌 수 없음.");
				flag = false;
				break;
			}
			result = num1 / num2;
			break;
		default:
			flag = false;
			System.out.println("잘못 된 연산자 입력");
			break;
		}
		
		if (flag) {
			System.out.println(num1 + operator + num2 + "=" + result);
		}
		
		// int num1=0, num2=0;
		// String operator;
		// char operator2 = 0;
		//
		// System.out.print("정수 두 개 입력:");
		// num1 = sc.nextInt();
		// num2 = sc.nextInt();
		//
		// System.out.println("연산자를 입력해주세요.");
		//
		// operator = sc.next();
		//
		// switch(operator) {
		// case "+":
		// System.out.println(num1 + num2);
		// break;
		// case "-":
		// System.out.println(num1 - num2);
		// break;
		// case "*":
		// System.out.println(num1 * num2);
		// break;
		// case "/":
		// System.out.println(num1 / num2);
		// break;
		// default:
		// System.out.println("잘못된 연산자를 입력하셨습니다.");
		// break;
		// }
		//
		// try {
		// operator2 = (char)System.in.read();
		// } catch (IOException e) {
		// // TODO Auto-generated catch block
		// e.printStackTrace();
		// }
		//
		// switch(operator2) {
		// case '+':
		// System.out.println(num1 + num2);
		// break;
		// case '-':
		// System.out.println(num1 - num2);
		// break;
		// case '*':
		// System.out.println(num1 * num2);
		// break;
		// case '/':
		// System.out.println(num1 / num2);
		// break;
		// default:
		// System.out.println("잘못된 연산자를 입력하셨습니다.");
		// break;
		// }
		//
		sc.close();
	}

}
