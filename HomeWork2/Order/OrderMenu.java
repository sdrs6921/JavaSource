package HomeWork2.Order;

import java.util.Scanner;

public class OrderMenu {
	private OrderService service;
	
	public OrderMenu(OrderService service) {
		this.service = service;
	}
	
	public void run(Scanner sc) {
		String menuStr = "ó���� ���� ��å\n1.�ֹ���� 2.�ֹ������� 3���� 4.�ֹ���� 5.����";
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
				System.out.println("�߸� �Է��ϼ̽��ϴ�. �ٽ� �Է��� �ּ���.");
				break;
			}
		}
	}
}
