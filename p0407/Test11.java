package p0407;

import java.util.Scanner;

public class Test11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int hp = 10, exp = 0, level = 1;
		int menuNum;
		boolean deadFlag = false;
		
		
		System.out.println("�޴�\n1.��Ա�  2.���ڱ�  3.��� 4.��ϱ� 5.����Ȯ�� 6.���� ");
		menuNum = sc.nextInt();
		while (menuNum != 6 || !deadFlag) {
			System.out.println("�޴�\n1.��Ա�  2.���ڱ�  3.��� 4.��ϱ� 5.����Ȯ�� 6.���� ");
			
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
				System.out.println("���ϸ��� �׾����ϴ�.");
				menuNum = 6;
			}
			else {
				menuNum = sc.nextInt();
			}
			if (menuNum == 6) {
				System.out.println("���ϸ� Ű��⸦ �����մϴ�.");
			}
		}
		
		sc.close();
	}

}
