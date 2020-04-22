package p0407;

import java.util.Scanner;

public class Test5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// String id = "1234";
		//
		// //equals(): 두 객체를 비교해서 동일하면 true 아니면 false
		// if (id.equals("1234")) {
		// System.out.println("id일치");
		// } else {
		// System.out.println("id불일치");
		// }
		
		//int, float
		//두 값이 동일함을 비교 == (숫자, 문자), 객체 타입은 비교 안됨
		
		Scanner sc = new Scanner(System.in);
		//id, pwd를 입력받아서 모두 일치하면 로그인 성공
		//id 틀리면 잘못된 id pwd 틀리면 잘못된 pwd
		String inputId = "", inputPwd = "";
		String id = "1234", pwd = "1234";
		System.out.print("id:");
		inputId = sc.nextLine();
		System.out.print("pwd:");
		inputPwd = sc.nextLine();
		
		// if (!(inputId.equals(id))) {
		// System.out.println("잘못된 id");
		// } else if (!(inputPwd.equals("pwd"))) {
		// System.out.println("잘못된 pwd");
		// } else {
		// System.out.println("로그인 성공!");
		// }
		
		if (inputId.equals(id)) {
			if (inputPwd.equals(pwd)) {
				System.out.println("로그인 성공");
			} else {
				System.out.println("id일치 pwd 불일치");
			}
		} else {
			System.out.println("id불일치");
		}
		
		sc.close();
	}
	
}
