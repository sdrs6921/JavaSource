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
		System.out.print("이름:");
		phone[count].name = sc.next();
		System.out.print("전화번호:");
		phone[count].number = sc.next();
		System.out.print("주소:");
		phone[count].address = sc.nextLine();
		
		if (duplicateCheck(phone, count)) {
			System.out.println("등록이 완료되었습니다.");
			count++;
		} else {
			System.out.println("중복된 이름입니다. 다시 입력해 주세요.");
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
			System.out.println("1.등록 (이름 중복 안됨) 2.검색  3.수정(전화/주소변경) 4.삭제 5.전체출력 6.종료");
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
				System.out.println("전화번호를 종료합니다.");
				break;
			}
		}
	}

}
