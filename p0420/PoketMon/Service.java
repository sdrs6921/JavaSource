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
			System.out.print("1.밥먹기 2.잠자기 3.놀기 4.운동하기 5.상태정보출력 6.종료 7.공격>>");
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
					System.out.println(p.name + "이 죽었습니다.");
					flag = false;
				}
				break;
			case 4:
				if(!p.exercise()) {
					System.out.println(p.name + "이 죽었습니다.");
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
					((Picachu) p).전기공격();
				} else if (p instanceof Gobook) {
					((Gobook) p).물대포();
				} else if (p instanceof Lee) {
					((Lee) p).넝쿨공격();
				}
			}
			
			p.levelCheck();
		}
		
		System.out.println("이용해주셔서 감사합니다.");
	}
}
