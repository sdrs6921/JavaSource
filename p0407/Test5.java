package p0407;

import java.util.Scanner;

public class Test5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// String id = "1234";
		//
		// //equals(): �� ��ü�� ���ؼ� �����ϸ� true �ƴϸ� false
		// if (id.equals("1234")) {
		// System.out.println("id��ġ");
		// } else {
		// System.out.println("id����ġ");
		// }
		
		//int, float
		//�� ���� �������� �� == (����, ����), ��ü Ÿ���� �� �ȵ�
		
		Scanner sc = new Scanner(System.in);
		//id, pwd�� �Է¹޾Ƽ� ��� ��ġ�ϸ� �α��� ����
		//id Ʋ���� �߸��� id pwd Ʋ���� �߸��� pwd
		String inputId = "", inputPwd = "";
		String id = "1234", pwd = "1234";
		System.out.print("id:");
		inputId = sc.nextLine();
		System.out.print("pwd:");
		inputPwd = sc.nextLine();
		
		// if (!(inputId.equals(id))) {
		// System.out.println("�߸��� id");
		// } else if (!(inputPwd.equals("pwd"))) {
		// System.out.println("�߸��� pwd");
		// } else {
		// System.out.println("�α��� ����!");
		// }
		
		if (inputId.equals(id)) {
			if (inputPwd.equals(pwd)) {
				System.out.println("�α��� ����");
			} else {
				System.out.println("id��ġ pwd ����ġ");
			}
		} else {
			System.out.println("id����ġ");
		}
		
		sc.close();
	}
	
}
