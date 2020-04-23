package HomeWork2.Factory;

import java.util.ArrayList;
import java.util.Scanner;

public class ServiceImpl_prod implements Service {
	private DAO dao;

	public ServiceImpl_prod(DAO dao) {
		// TODO Auto-generated constructor stub
		this.dao = dao;
	}

	@Override
	public void addProduct(Scanner sc) {
		// TODO Auto-generated method stub
		System.out.println("제품을 추가합니다");
		System.out.print("제품명 :");
		String name = sc.next();
		System.out.print("가격 :");
		int price = sc.nextInt();
		System.out.print("수량 :");
		int amount = sc.nextInt();
		
		dao.insert(new Product(name, price, amount));
	}

	@Override
	public void printProduct(Scanner sc) {
		// TODO Auto-generated method stub
		System.out.print("검색하실 제품의 번호를 입력해주세요 >>");
		int num = sc.nextInt();
		Product p = dao.selectByNum(num);
		if (p != null) {
			System.out.println(p.toString());
		} else {
			System.out.println("해당 번호의 제품이 존재하지 않습니다.");
		}
	}

	@Override
	public void printAll() {
		// TODO Auto-generated method stub
		System.out.println("제품 목록을 출력합니다.");
		ArrayList<Product> datas = dao.selectAll2();
		
		for (Product p : datas) {
			System.out.println(p.toString());
		}
	}

	@Override
	public void getByName(Scanner sc) {
		// TODO Auto-generated method stub
		System.out.print("검색하실 제품 명을 입력해주세요>>");
		String name = sc.next();
		ArrayList<Product> datas = dao.selectByName2(name);
		
		for (Product p : datas) {
			System.out.println(p.toString());
		}
	}

	@Override
	public void editPrice(Scanner sc) {
		// TODO Auto-generated method stub
		Product p = new Product();
		System.out.print("가격을 수정할 제품의 번호를 입력해주세요 >>");
		int num = sc.nextInt();
		System.out.print("수정할 가격을 입력해주세요 >>");
		int price = sc.nextInt();
		p.setNum(num);
		p.setPrice(price);
		
		dao.updatePrice(p);
	}

	@Override
	public void in(Scanner sc) {
		// TODO Auto-generated method stub
		Product p = new Product();
		
		p.setName("in");
		System.out.print("입고할 제품의 번호를 입력해주세요 >>");
		int num = sc.nextInt();
		p.setNum(num);
		System.out.print("입고할 제품의 수량을 입력해주세요 >>");
		int amount = sc.nextInt();
		p.setAmount(amount);
		
		dao.in_out(p);
	}

	@Override
	public void out(Scanner sc) {
		// TODO Auto-generated method stub

	}

	@Override
	public void delProduct(Scanner sc) {
		// TODO Auto-generated method stub
		int num;
		System.out.print("삭제하실 제품 번호를 입력해 주세요 >>");
		num = sc.nextInt();
		dao.delete(num);
	}

	@Override
	public Product getByNum(int num) {
		// TODO Auto-generated method stub
		return dao.selectByNum(num);
	}

	@Override
	public Product[] getAll() {
		// TODO Auto-generated method stub
		return dao.selectAll();
	}

}
