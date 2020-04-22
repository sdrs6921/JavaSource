package HomeWork1;

import java.util.Scanner;

import HomeWork1.Factory.FactoryMenu;
import HomeWork1.Factory.FactoryService;
import HomeWork1.Order.OrderMenu;
import HomeWork1.Order.OrderService;

public class Menu {
	private FactoryMenu factoryMenu;
	private OrderMenu orderMenu;
	private FactoryService factoryService;
	private OrderService orderService;
	Scanner sc = new Scanner(System.in);

	public Menu() {
		factoryService = new FactoryService();
		factoryMenu = new FactoryMenu(factoryService);
	}

	public void run() {
		String menuStr = "업장 선택\n1.공장 2.편의점 3.종료 >>";
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
				System.out.println("잘못된 값을 입력하셨습니다. 다시 입력해 주세요.");
				break;
			}
		}
		
		System.out.println("이용해주셔서 감사합니다.");
	}
}
