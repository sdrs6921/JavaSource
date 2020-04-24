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
		String menuStr = "ó���� ���� ����\n1.��ǰ��� 2.��ȣ�ΰ˻�.3.�̸����ΰ˻� 4.���ݼ��� 5.���� 6.��ǰ������ 7.�԰� 8.��� 9.���� >>";
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
				System.out.println("��ȣ�� �߸� �Է��ϼ̽��ϴ�.");
				break;
			}
		}
	}
}
