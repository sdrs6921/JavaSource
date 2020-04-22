package p0410;

import java.util.Scanner;

class Member {
	String memberId;
	String password;
	String memberName;
	String email;

	void setMemberInfo(String id, String pwd, String name, String mail) {
		memberId = id;
		password = pwd;
		memberName = name;
		email = mail;
	}

	void printMemberInfo() {
		System.out.println("ID:" + memberId);
		System.out.println("Password:" + password);
		System.out.println("Name:" + memberName);
		System.out.println("Email:" + email);
	}

}

public class MemberManageMent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Member m = new Member();
		String id, pwd, name, email;
		Scanner sc = new Scanner(System.in);
		System.out.println("====ȸ������=====");
		System.out.print("ID:");
		m.memberId = sc.next();
		System.out.print("Password:");
		m.password = sc.next();
		System.out.print("Name:");
		m.memberName = sc.next();
		System.out.print("Email:");
		m.email = sc.next();
		System.out.println("==ȸ�������� �Ϸ�Ǿ����ϴ�.==");
		System.out.println("=========�α���=========");

		while (true) {
			System.out.print("ID:");
			id = sc.next();
			System.out.print("Password:");
			pwd = sc.next();

			if (m.memberId.equals(id)) {
				if (m.password.equals(pwd)) {
					System.out.println("==�α��� ����==");
					break;
				} else {
					System.out.println("==��й�ȣ�� �ٽ� �Է����ּ���==");
				}
			} else {
				System.out.println("==���̵� �ٽ� �Է��� �ּ���.==");
			}
		}

		System.out.println("===ȸ�� ������ ����մϴ�.===");
		m.printMemberInfo();

		System.out.println("===ȸ�� ������ �����մϴ�.===");
		System.out.println("������ ȸ�� ���� �Է� : 1.Password 2.Name 3.Email");

		int menuNum = sc.nextInt();

		switch (menuNum) {
		case 1:
			System.out.print("Password:");
			m.password = sc.next();
			break;
		case 2:
			System.out.print("Name:");
			m.memberName = sc.next();
			break;
		case 3:
			System.out.print("Email:");
			m.email = sc.next();
			break;
		default:
			System.out.println("�߸��� �޴��Դϴ�.");
			break;
		}

		System.out.println("===������ ȸ�� ������ ����մϴ�.===");
		m.printMemberInfo();

		sc.close();
	}

}
