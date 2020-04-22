package p0410;

import java.util.Scanner;

class Phone {
	String name;
	String number;
	String address;

	void setInfo(String n, String num, String addr) {
		name = n;
		number = num;
		address = addr;
	}

	void printInfo() {
		System.out.println(name + "\t" + number + "\t" + address);
	}
}

public class PhoneBookMain {
	static boolean duplicateCheck(Phone[] phone, int count) {
		boolean flag = true;
		for (int i = 0; i < count; i++) {
			if (phone[count].name.equals(phone[i].name)) {
				 flag = false;
			}
		}
		return flag;	
	}

	static void enroll(Scanner sc, Phone[] phone, int count) {
		System.out.print("�̸�:");
		phone[count].name = sc.next();
		System.out.print("��ȭ��ȣ:");
		phone[count].number = sc.next();
		System.out.print("�ּ�:");
		phone[count].address = sc.nextLine();
		
		if (duplicateCheck(phone, count)) {
			System.out.println("����� �Ϸ�Ǿ����ϴ�.");
			count++;
		} else {
			System.out.println("�ߺ��� �̸��Դϴ�. �ٽ� �Է��� �ּ���.");
		}
	}
	
	static void printAll(Phone[] phone, int count) {
		for (int i = 0; i < count; i++) {
			phone[i].printInfo();
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int menu, count = 0;
		boolean exit = false;
		Phone[] phone = new Phone[10];

		for (int i = 0; i < phone.length; i++) {
			phone[i] = new Phone();
		}

		while (true) {
			System.out.println("1.��� (�̸� �ߺ� �ȵ�) 2.�˻�  3.����(��ȭ/�ּҺ���) 4.���� 5.��ü��� 6.����");
			menu = sc.nextInt();
			switch (menu) {
			case 1:
				enroll(sc, phone, count);
				break;
			case 5:
				printAll(phone, count);
			case 6:
				exit = true;
				break;
			}
			if (exit) {
				System.out.println("��ȭ��ȣ�� �����մϴ�.");
				break;
			}
		}
	}

}
