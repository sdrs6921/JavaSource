package p0423.address;

import java.util.Scanner;

public class Menu {
	private Service service;
	
	public Menu(Service service) {
		this.service = service;
	}
	
	public void run(Scanner sc) {
		boolean flag = true;
		String menuStr = "원하는 메뉴를 선택해주세요\n1.등록 2.검색 3.수정 4.삭제 5.목록 6.종료 >>";
		
		while (flag) {
			System.out.print(menuStr);
			int menu = sc.nextInt();
			
			switch (menu) {
			case 1:
				service.addMember(sc);
				break;
			case 2:
				service.getMember(sc);
				break;
			case 3:
				service.editMember(sc);
				break;
			case 4:
				service.delMember(sc);
				break;
			case 5:
				service.getAll();
				break;
			case 6:
				flag = false;
				break;
			}
		}
		System.out.println("이용해주셔서 감사합니다.");
	}
}
