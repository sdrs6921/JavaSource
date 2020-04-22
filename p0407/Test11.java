package p0407;

import java.util.Scanner;

public class Test11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int hp = 10, exp = 0, level = 1;
		int menuNum;
		boolean deadFlag = false;
		
		
		System.out.println("메뉴\n1.밥먹기  2.잠자기  3.놀기 4.운동하기 5.상태확인 6.종료 ");
		menuNum = sc.nextInt();
		while (menuNum != 6 || !deadFlag) {
			System.out.println("메뉴\n1.밥먹기  2.잠자기  3.놀기 4.운동하기 5.상태확인 6.종료 ");
			
			switch(menuNum) {
			case 1:
				hp+=5;
				break;
			case 2:
				hp += 10;
				break;
			case 3:
				hp -= 8;
				exp += 10;
				break;
			case 4:
				hp -= 15;
				exp += 15;
				break;
			case 5:
				System.out.println("hp : " + hp);
				System.out.println("exp : " + exp);
				System.out.println("level : " + level);
			}
			
			if (exp >= 20) {
				System.out.println("Level up!!");
				exp -= 20;
				level++;
			}
			
			if (hp <= 0) {
				deadFlag = true;
				System.out.println("포켓몬이 죽었습니다.");
				menuNum = 6;
			}
			else {
				menuNum = sc.nextInt();
			}
			if (menuNum == 6) {
				System.out.println("포켓몬 키우기를 종료합니다.");
			}
		}
		
		sc.close();
	}

}
