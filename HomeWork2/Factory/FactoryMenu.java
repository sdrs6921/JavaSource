package HomeWork2.Factory;

import java.util.Scanner;

public class FactoryMenu {
	private Service service;
	private HomeWork2.Order.Service oService;
	
	public FactoryMenu(Service service, HomeWork2.Order.Service o) {
		this.service = service;
		this.oService = o;
	}

	public void run(Scanner sc) {
		boolean flag = true;
		String menuStr = "처리할 업무 선택\n1.제품등록 2.번호로검색.3.이름으로검색 4.가격수정 5.삭제 6.제품목록출력 7.입고 8.출고 9.종료 >>";
		int menu = 0;
		while (flag) {
			System.out.print(menuStr);
			menu = sc.nextInt();

			switch (menu) {
			case 1:
				service.addProduct(sc);
				break;
			case 2:
				service.printProduct(sc);
				break;
			case 3:
				service.getByName(sc);
				break;
			case 4:
				service.editPrice(sc);
				break;
			case 5:
				service.delProduct(sc);
				break;
			case 6:
				service.printAll();
				break;
			case 7:
				service.in(sc);
			case 8:
				service.out(oService.getOutList());
				break;
			case 9:
				flag = false;
				break;
			default:
				System.out.println("번호를 잘못 입력하셨습니다.");
				break;
			}
		}
	}
}
