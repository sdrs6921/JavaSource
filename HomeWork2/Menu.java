package HomeWork2;

import java.util.Scanner;

import HomeWork2.Factory.DaoImplArrayList;
import HomeWork2.Factory.FactoryMenu;
import HomeWork2.Factory.Service;
import HomeWork2.Factory.ServiceImpl_prod;
import HomeWork2.Order.DAOImple;
import HomeWork2.Order.OrderMenu;

public class Menu {
	private FactoryMenu factoryMenu;
	private OrderMenu orderMenu;
	private Service factoryService;//Interface 타입으로 서비스 구현 객체를 업캐스팅 목적으로 함. 부품 교체를 쉽게 하기 위해
	private HomeWork2.Order.Service orderService;
	Scanner sc = new Scanner(System.in);

	public Menu() {
		factoryService = new ServiceImpl_prod(new DaoImplArrayList());//Upcasting 적용
		orderService = new HomeWork2.Order.ServiceImple_order(new DAOImple());
		factoryMenu = new FactoryMenu(factoryService, orderService);
		orderMenu = new OrderMenu(orderService, factoryService);
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
				orderMenu.run(sc);
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
