package p0406;
import java.util.Scanner;

public class Test9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		// for (int i = 1; i <= 100; i++) {
		// System.out.println(i);
		// }
		//
		//1~100 �߿��� Ȧ���� ���
		// for (int i = 1; i <= 100; i++) {
		// if (i % 2 == 1) {
		// System.out.println(i);
		// }
		// }
		
		// //1~100������ ��
		// int res = 0;
		//
		// for (int i = 1; i <= 100; i++) {
		// res += i;
		// }
		//
		// System.out.println(res);
		//
		// //�ش� ������ ��� ����ϱ�
		// int num = 0;
		// System.out.print("����� ���� ���� �Է�:");
		// num = sc.nextInt();
		//
		// for (int i = 1; i <=num; i++) {
		// if (num % i == 0) {
		// System.out.print(i + " ");
		// }
		// }
		// System.out.println();
		
		//99�� �� 4�� ���
		for (int i = 1; i < 10; i++) {
			System.out.println("4*" + i + " = " + 4*i);
		}
		
		System.out.println("=========");
		
		int num = 0;
		String star = "*";
		
		System.out.print("����� �ܰ�: ");
		num = sc.nextInt();
		for (int i = 0; i < num; i++) {
			System.out.println(star);
			star += "*";
		}
		sc.close();
	}
	
	

}
