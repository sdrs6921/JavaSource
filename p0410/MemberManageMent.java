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
		System.out.println("====회원가입=====");
		System.out.print("ID:");
		m.memberId = sc.next();
		System.out.print("Password:");
		m.password = sc.next();
		System.out.print("Name:");
		m.memberName = sc.next();
		System.out.print("Email:");
		m.email = sc.next();
		System.out.println("==회원가입이 완료되었습니다.==");
		System.out.println("=========로그인=========");

		while (true) {
			System.out.print("ID:");
			id = sc.next();
			System.out.print("Password:");
			pwd = sc.next();

			if (m.memberId.equals(id)) {
				if (m.password.equals(pwd)) {
					System.out.println("==로그인 성공==");
					break;
				} else {
					System.out.println("==비밀번호를 다시 입력해주세요==");
				}
			} else {
				System.out.println("==아이디를 다시 입력해 주세요.==");
			}
		}

		System.out.println("===회원 정보를 출력합니다.===");
		m.printMemberInfo();

		System.out.println("===회원 정보를 수정합니다.===");
		System.out.println("수정할 회원 정보 입력 : 1.Password 2.Name 3.Email");

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
			System.out.println("잘못된 메뉴입니다.");
			break;
		}

		System.out.println("===수정된 회원 정보를 출력합니다.===");
		m.printMemberInfo();

		sc.close();
	}

}
