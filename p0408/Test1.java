package p0408;

import java.util.Scanner;

public class Test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num;
		String str = "";
		Scanner sc = new Scanner(System.in);
		
		while (true) {
			System.out.println("����� ���ڸ� �Է��϶�");
			num = sc.nextInt();
			System.out.println("�Է°�:" + num);
			System.out.println("���߷��� stop�� �Է��϶�");
			str=sc.next();
			if (str.equals("stop")) {
				break;
			}
		}
		sc.close();
	}

}
