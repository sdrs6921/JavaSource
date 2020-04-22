package p0420.PoketMon;

import java.util.Scanner;

public class Service {
	PoketMon p;

	public Service(PoketMon p) {
		this.p = p;
	}

	public void play(Scanner sc) {
		int mode;
		boolean flag = true;

		while (flag) {
			System.out.print("1.��Ա� 2.���ڱ� 3.��� 4.��ϱ� 5.����������� 6.���� 7.����>>");
			mode = sc.nextInt();
			
			switch (mode) {
			case 1:
				p.eat();
				break;
			case 2:
				p.sleep();
				break;
			case 3:
				if(!p.play()) {
					System.out.println(p.name + "�� �׾����ϴ�.");
					flag = false;
				}
				break;
			case 4:
				if(!p.exercise()) {
					System.out.println(p.name + "�� �׾����ϴ�.");
					flag = false;
				}
				break;
			case 5:
				p.printInfo();
				break;
			case 6:
				flag = false;
				break;
			case 7:
				if (p instanceof Picachu) {
					((Picachu) p).�������();
				} else if (p instanceof Gobook) {
					((Gobook) p).������();
				} else if (p instanceof Lee) {
					((Lee) p).�������();
				}
			}
			
			p.levelCheck();
		}
		
		System.out.println("�̿����ּż� �����մϴ�.");
	}
}
