package p0420.PoketMon;

import java.util.Scanner;

public class Menu {
	public void run(Scanner sc) {
		int menu;
		boolean flag = true;
		Service s;	

		while (flag) {
			System.out.println("캐릭터를 선택해 주세요.");
			System.out.print("1. 피카츄  2.꼬북이 3.이상해씨 4.종료 >>");
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
				System.out.println("잘못 누루셨습니다.");
			}
		}
		
		System.out.println("이용해 주셔서 감사합니다.");
	}
}
