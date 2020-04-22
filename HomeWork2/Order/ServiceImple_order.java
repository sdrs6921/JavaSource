package HomeWork2.Order;

import java.util.Scanner;

public class ServiceImple_order implements OrderService {
	private DAO orderDao;
	
	
	public ServiceImple_order(DAO orderDao) {
		this.orderDao = orderDao;
	}
	
	@Override
	public void addOrder(Scanner sc) {
		// TODO Auto-generated method stub
		System.out.println("주문을 처리합니다.");
		System.out.print("제품번호:");
		int num = sc.nextInt();
		System.out.print("주문수량:");
		int amount = sc.nextInt();
		
		//TODO How To get Factory DAO
	}

	public void printOrder(Scanner sc) {
		// TODO Auto-generated method stub
		System.out.print("검색하실 주문 번호를 입력하시오>>");
		int num = sc.nextInt();
		Order order = orderDao.selectByNum(num);
		System.out.println(order.toString());
	}

	public void pay(Scanner sc) {
		// TODO Auto-generated method stub
		System.out.print("결제 처리할 주문 번호를 입력하시오>>");
		int num = sc.nextInt();
		Order order = orderDao.selectByNum(num);
		if (order == null) {
			System.out.println("없는 주문 번호입니다.");
		} else if (order.isPaid()) {
			System.out.println("이미 결제가 완료되었습니다.");
		} else {
			order.setPaid(false);
			System.out.println("결제 처리가 완료되었습니다.");
		}
		
		
	}

	public void delOrder(Scanner sc) {
		// TODO Auto-generated method stub
		System.out.print("삭제할 주문 번호를 입력하시오>>");
		int num = sc.nextInt();
		orderDao.delete(num);
	}

}
