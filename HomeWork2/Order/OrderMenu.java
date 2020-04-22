package HomeWork2.Order;

import java.util.Scanner;

public class OrderMenu {
	private OrderService service;
	
	public OrderMenu(OrderService service) {
		this.service = service;
	}
	
	public void run(Scanner sc) {
		String menuStr = "처리할 업무 선책\n1.주문등록 2.주문목록출력 3결제 4.주문취소 5.종료";
		int menu = 0;
		boolean flag = true;
		
		while (flag) {
			System.out.print(menuStr);
			menu = sc.nextInt();
			
			switch (menu) {
			case 1:
				service.addOrder(sc);
				break;
			case 2:
				service.printOrder(sc);
				break;
			case 3:
				service.pay(sc);
				break;
			case 4:
				service.delOrder(sc);
				break;
			case 5:
				flag = false;
				break;
			default:
				System.out.println("잘못 입력하셨습니다. 다시 입력해 주세요.");
				break;
			}
		}
	}
}
