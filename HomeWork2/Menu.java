package HomeWork2;

import java.util.Scanner;

import HomeWork2.Factory.DAOImple;
import HomeWork2.Factory.FactoryMenu;
import HomeWork2.Factory.Service;
import HomeWork2.Factory.ServiceImpl_prod;
import HomeWork2.Order.OrderMenu;
import HomeWork2.Order.OrderService;

public class Menu {
	private FactoryMenu factoryMenu;
	private OrderMenu orderMenu;
	private Service factoryService;//Interface Ÿ������ ���� ���� ��ü�� ��ĳ���� �������� ��. ��ǰ ��ü�� ���� �ϱ� ����
	private OrderService orderService;
	Scanner sc = new Scanner(System.in);

	public Menu() {
		factoryService = new ServiceImpl_prod(new DAOImple());//Upcasting ����
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
