package p0429.jdbc.addr;

import java.util.Scanner;

public class Menu {
	private Service service;
	
	public Menu() {
		this.service = new ServiceImpl();
	}

	public void run(Scanner sc) {
		boolean flag = true;
		String str = "1.등록 2.번호로 검색 3.이름으로 검색 4.수정 5.삭제 6.전체목록출력 7.종료";
		
		while (true) {
			System.out.println(str);
			
			switch (sc.nextInt()) {
			case 1:
				service.addMember(sc);
				break;
			case 2:
				service.getMember(sc);
				break;
			case 3:
				service.getByName(sc);
				break;
			case 4:
				service.editMember(sc);
				break;
			case 5:
				service.deleteMember(sc);
				break;
			case 6:
				service.getAll();
				break;
			case 7:
				flag = false;
				System.out.println("이용해주셔서 감사합니다.");
				break;
			default:
				System.out.println("다시 입력해 주세요.");
				break;
			}
		}
	}
}
