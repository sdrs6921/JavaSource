package HomeWork1.Factory;

import java.util.Scanner;

public class FactoryMenu {
	private FactoryService service;

	public FactoryMenu(FactoryService service) {
		this.service = service;
	}

	public void run(Scanner sc) {
		boolean flag = true;
		String menuStr = "처리할 업무 선택\n1.제품등록 2.번호로검색.3.이름으로검색 4.가격수정 5.삭제 6.제품목록출력 7.입출고 8.종료 >>";
		int menu = 0;
		while (flag) {
			System.out.print(menuStr);
			menu = sc.nextInt();

			switch (menu) {
			case 1:
				service.addProduct(sc);
				break;
			case 2:
				service.getProductByNum(sc);
				break;
			case 3:
				service.getProductByName(sc);
				break;
			case 4:
				service.editProduct(sc);
				break;
			case 5:
				service.deleteProduct(sc);
				break;
			case 6:
				service.printAll();
				break;
			case 7:
				service.in_out(sc);
				break;
			case 8:
				flag = false;
				break;
			default:
				System.out.println("번호를 잘못 입력하셨습니다.");
				break;
			}
		}
	}
}
