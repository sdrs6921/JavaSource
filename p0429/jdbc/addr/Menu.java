package p0429.jdbc.addr;

import java.util.Scanner;

public class Menu {
	private Service service;
	
	public Menu() {
		this.service = new ServiceImpl();
	}

	public void run(Scanner sc) {
		boolean flag = true;
		String str = "1.��� 2.��ȣ�� �˻� 3.�̸����� �˻� 4.���� 5.���� 6.��ü������ 7.����";
		
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
				System.out.println("�̿����ּż� �����մϴ�.");
				break;
			default:
				System.out.println("�ٽ� �Է��� �ּ���.");
				break;
			}
		}
	}
}
