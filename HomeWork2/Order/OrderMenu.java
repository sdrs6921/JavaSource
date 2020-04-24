package HomeWork2.Order;

import java.util.Scanner;

public class OrderMenu {
	private Service orderService;
	private HomeWork2.Factory.Service prodService;

	public OrderMenu(Service oService, HomeWork2.Factory.Service pService) {
		orderService = oService;
		prodService = pService;
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
				orderService.addOrder(sc, prodService.getAll());
				break;
			case 2:
				orderService.printOrder(sc);
				break;
			case 3:
				orderService.pay(sc);
				break;
			case 4:
				orderService.delOrder(sc);
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
