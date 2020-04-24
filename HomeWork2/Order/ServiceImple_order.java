package HomeWork2.Order;

import java.util.ArrayList;
import java.util.Scanner;

import HomeWork2.Factory.Product;

public class ServiceImple_order implements Service {
	private DAO dao;
	
	
	public ServiceImple_order(DAO dao) {
		this.dao = dao;
	}


	@Override
	public void addOrder(Scanner sc, ArrayList<Product> prods) {
		// TODO Auto-generated method stub
		System.out.println("<<주문 가능한 상품 목록>>");
		for (Product p : prods) {
			System.out.println(p);
		}
		
		Product p = null;
		
		do {
			System.out.print("주문할 상품 번호:");
			int num = sc.nextInt();
			p = new Product();
			p.setNum(num);
		}	while (prods.contains(p));
		
		int idx = prods.indexOf(p);
		p = prods.get(idx);
		System.out.print("주문 수량:");
		int q = sc.nextInt();
		
		dao.insert(new Order(p, q));
	}


	@Override
	public void printOrder(Scanner sc) {
		// TODO Auto-generated method stub
		ArrayList<Order> datas = dao.selectAll();
		
		if (datas.isEmpty()) {
			System.out.println("등록된 주문이 없습니다.");
		} else {
			for (Order o : datas) {
				System.out.println(o);
			}
		}
	}


	@Override
	public void pay(Scanner sc) {
		// TODO Auto-generated method stub
		ArrayList<Order> a1 = dao.selectByPayfalse();
		
		System.out.println("<<미결제 주문 목록 출력>>");
		for (Order o : a1) {
			System.out.println(o);
		}
		
		System.out.print("결제할 주문 번호 입력>>");
		int num = sc.nextInt();
		Order o = dao.selectByNum(num);
		
		if (o != null) {
			o.setPaid(true);
		} else {
			System.out.println("없는 주문 번호입니다.");
		}
	}


	@Override
	public void delOrder(Scanner sc) {
		// TODO Auto-generated method stub
		System.out.print("삭제 할 주문 번호 입력>>");
		int num = sc.nextInt();
		dao.delete(num);
	}


	@Override
	public ArrayList<Order> getOutList() {
		// TODO Auto-generated method stub
		return dao.selectByRelease();
	}



	
	
}
