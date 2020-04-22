package HomeWork1;

import java.util.Scanner;

import HomeWork1.Factory.FactoryMenu;
import HomeWork1.Factory.FactoryService;
import HomeWork1.Order.OrderMenu;
import HomeWork1.Order.OrderService;

public class Menu {
	private FactoryMenu factoryMenu;
	private OrderMenu orderMenu;
	private FactoryService factoryService;
	private OrderService orderService;
	Scanner sc = new Scanner(System.in);

	public Menu() {
		factoryService = new FactoryService();
		factoryMenu = new FactoryMenu(factoryService);
	}

	public void run() {
		String menuStr = "���� ����\n1.���� 2.������ 3.���� >>";
		int menu = 0;
		boolean flag = true;

		while (flag) {
			System.out.print(menuStr);
			menu = sc.nextInt();
			
			switch (menu) {
			case 1:
				factoryMenu.run(sc);
				break;
			case 2:
				//TODO - orderMenu.run();
				break;
			case 3:
				flag = false;
				break;
			default:
				System.out.println("�߸��� ���� �Է��ϼ̽��ϴ�. �ٽ� �Է��� �ּ���.");
				break;
			}
		}
		
		System.out.println("�̿����ּż� �����մϴ�.");
	}
}
