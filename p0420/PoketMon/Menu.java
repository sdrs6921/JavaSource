package p0420.PoketMon;

import java.util.Scanner;

public class Menu {
	public void run(Scanner sc) {
		int menu;
		boolean flag = true;
		Service s;	

		while (flag) {
			System.out.println("ĳ���͸� ������ �ּ���.");
			System.out.print("1. ��ī��  2.������ 3.�̻��ؾ� 4.���� >>");
			menu = sc.nextInt();
			
			switch (menu) {
			case 1:
				s = new Service(new Picachu());
				s.play(sc);
				break;
			case 2:
				s = new Service(new Gobook());
				s.play(sc);
				break;
			case 3:
				s = new Service(new Lee());
				s.play(sc);
				break;
			case 4:
				flag = false;
				break;
			default:
				System.out.println("�߸� ����̽��ϴ�.");
			}
		}
		
		System.out.println("�̿��� �ּż� �����մϴ�.");
	}
}
