package p0407;

import java.util.Scanner;

public class Test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Scanner class�� �̿��� �Է� -> �ξ� ���� ����
		Scanner sc = new Scanner(System.in);
		System.out.print("��ȣ:");
		int num = sc.nextInt();
		System.out.print("�̸�:");
		String name = sc.next();
		System.out.print("Ű:");
		float height = sc.nextFloat();
		System.out.print("�ּ�:");
		sc.nextLine();
		String address = sc.nextLine();
		
		
		System.out.println("num: " + num);
		System.out.println("name: " + name);
		System.out.println("height: " + height);
		System.out.println("address: " + address);
		
		sc.close();
		// ǥ�� �Է�
		// try {
		// //program�� �ߴܵ��� �ʰ�
		// int a = System.in.read();
		// System.out.println((char)a);
		// } catch (IOException e) {
		// // TODO Auto-generated catch block
		// e.printStackTrace();
		// }
		//
		// // int a = 10, b = 20;
		// // Short - circuit�� ���� 69p
		// // boolean flag = (a >= 10 && b > 20);
		// // System.out.println(flag);
	}

}
