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
		System.out.println("�ֹ��� ó���մϴ�.");
		System.out.print("��ǰ��ȣ:");
		int num = sc.nextInt();
		System.out.print("�ֹ�����:");
		int amount = sc.nextInt();
		
		//TODO How To get Factory DAO
	}

	public void printOrder(Scanner sc) {
		// TODO Auto-generated method stub
		System.out.print("�˻��Ͻ� �ֹ� ��ȣ�� �Է��Ͻÿ�>>");
		int num = sc.nextInt();
		Order order = orderDao.selectByNum(num);
		System.out.println(order.toString());
	}

	public void pay(Scanner sc) {
		// TODO Auto-generated method stub
		System.out.print("���� ó���� �ֹ� ��ȣ�� �Է��Ͻÿ�>>");
		int num = sc.nextInt();
		Order order = orderDao.selectByNum(num);
		if (order == null) {
			System.out.println("���� �ֹ� ��ȣ�Դϴ�.");
		} else if (order.isPaid()) {
			System.out.println("�̹� ������ �Ϸ�Ǿ����ϴ�.");
		} else {
			order.setPaid(false);
			System.out.println("���� ó���� �Ϸ�Ǿ����ϴ�.");
		}
		
		
	}

	public void delOrder(Scanner sc) {
		// TODO Auto-generated method stub
		System.out.print("������ �ֹ� ��ȣ�� �Է��Ͻÿ�>>");
		int num = sc.nextInt();
		orderDao.delete(num);
	}

}
