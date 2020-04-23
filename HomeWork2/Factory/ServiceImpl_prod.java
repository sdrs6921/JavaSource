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
		System.out.println("��ǰ�� �߰��մϴ�");
		System.out.print("��ǰ�� :");
		String name = sc.next();
		System.out.print("���� :");
		int price = sc.nextInt();
		System.out.print("���� :");
		int amount = sc.nextInt();
		
		dao.insert(new Product(name, price, amount));
	}

	@Override
	public void printProduct(Scanner sc) {
		// TODO Auto-generated method stub
		System.out.print("�˻��Ͻ� ��ǰ�� ��ȣ�� �Է����ּ��� >>");
		int num = sc.nextInt();
		Product p = dao.selectByNum(num);
		if (p != null) {
			System.out.println(p.toString());
		} else {
			System.out.println("�ش� ��ȣ�� ��ǰ�� �������� �ʽ��ϴ�.");
		}
	}

	@Override
	public void printAll() {
		// TODO Auto-generated method stub
		System.out.println("��ǰ ����� ����մϴ�.");
		ArrayList<Product> datas = dao.selectAll2();
		
		for (Product p : datas) {
			System.out.println(p.toString());
		}
	}

	@Override
	public void getByName(Scanner sc) {
		// TODO Auto-generated method stub
		System.out.print("�˻��Ͻ� ��ǰ ���� �Է����ּ���>>");
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
		System.out.print("������ ������ ��ǰ�� ��ȣ�� �Է����ּ��� >>");
		int num = sc.nextInt();
		System.out.print("������ ������ �Է����ּ��� >>");
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
		System.out.print("�԰��� ��ǰ�� ��ȣ�� �Է����ּ��� >>");
		int num = sc.nextInt();
		p.setNum(num);
		System.out.print("�԰��� ��ǰ�� ������ �Է����ּ��� >>");
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
		System.out.print("�����Ͻ� ��ǰ ��ȣ�� �Է��� �ּ��� >>");
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
