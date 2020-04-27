package p0427.memo;

import java.util.Scanner;

public class Menu {
	private Service service;
	
	public Menu() {
		service = new Service();
	}

	public void run(Scanner sc) {
		String menuStr = "메뉴를 선택해 주세요\n1.읽기 2.쓰기 3.삭제 4.종료";
		boolean flag = true;
		
		service.mkDir();
		
		while (flag) {
			System.out.print(menuStr);
			int menu = sc.nextInt();
			
			switch (menu) {
			case 1:
				service.readFile(sc);
				break;
			case 2:
				service.writeFile(sc);
				break;
			case 3:
				service.delFile(sc);
				break;
			case 4:
				flag = false;
				break;
			}
		}
		
		System.out.println("이용해 주셔서 감사합니다.");
	}
}
