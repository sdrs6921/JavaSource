package HomeWork1.Factory;

import java.util.Scanner;

public class FactoryMenu {
	private FactoryService service;

	public FactoryMenu(FactoryService service) {
		this.service = service;
	}

	public void run(Scanner sc) {
		boolean flag = true;
		String menuStr = "ó���� ���� ����\n1.��ǰ��� 2.��ȣ�ΰ˻�.3.�̸����ΰ˻� 4.���ݼ��� 5.���� 6.��ǰ������ 7.����� 8.���� >>";
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
				System.out.println("��ȣ�� �߸� �Է��ϼ̽��ϴ�.");
				break;
			}
		}
	}
}
