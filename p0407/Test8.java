package p0407;

import java.util.Scanner;

public class Test8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int num1, num2, result = 0;
		boolean flag = true;
		String operator;

		System.out.print("���� 2�� �Է�:");
		num1 = sc.nextInt();
		num2 = sc.nextInt();
		System.out.print("������:");
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
				System.out.println("0���� ���� �� ����.");
				flag = false;
				break;
			}
			result = num1 / num2;
			break;
		default:
			flag = false;
			System.out.println("�߸� �� ������ �Է�");
			break;
		}
		
		if (flag) {
			System.out.println(num1 + operator + num2 + "=" + result);
		}
		
		// int num1=0, num2=0;
		// String operator;
		// char operator2 = 0;
		//
		// System.out.print("���� �� �� �Է�:");
		// num1 = sc.nextInt();
		// num2 = sc.nextInt();
		//
		// System.out.println("�����ڸ� �Է����ּ���.");
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
		// System.out.println("�߸��� �����ڸ� �Է��ϼ̽��ϴ�.");
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
		// System.out.println("�߸��� �����ڸ� �Է��ϼ̽��ϴ�.");
		// break;
		// }
		//
		sc.close();
	}

}
