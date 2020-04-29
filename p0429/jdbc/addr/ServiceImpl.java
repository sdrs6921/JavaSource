package p0429.jdbc.addr;

import java.util.ArrayList;
import java.util.Scanner;

public class ServiceImpl implements Service {
	private Dao dao;
	
	public ServiceImpl() {
		dao = new DaoImpl();
	}
	
	public ServiceImpl(Dao dao) {
		// TODO Auto-generated constructor stub
		this.dao = dao;
	}
	@Override
	public void addMember(Scanner sc) {
		// TODO Auto-generated method stub
		Member m = new Member();
		System.out.print("�̸�>> ");
		m.setName(sc.next());
		System.out.print("��ȭ��ȣ>> ");
		m.setTel(sc.next());
		System.out.print("�ּ�>> ");
		m.setAddress(sc.next());
		
		dao.insert(m);
	}

	@Override
	public void getMember(Scanner sc) {
		// TODO Auto-generated method stub
		System.out.print("�˻��� ��ȣ>> ");
		Member m = dao.selectByNum(sc.nextInt());
		if (m == null) {
			System.out.println("�˻��� ��ȣ�� �������� �ʽ��ϴ�.");
		} else {
			System.out.println(m);
		}
	}

	@Override
	public void getByName(Scanner sc) {
		// TODO Auto-generated method stub
		ArrayList<Member> list;
		System.out.print("�˻��� �̸�>> ");
		list = dao.selectByName(sc.next());
		
		if (list.size() <= 0) {
			System.out.println("�˻� ����� �����ϴ�.");
		} else {
			for (Member m : list) {
				System.out.println(m);
			}
		}
	}

	@Override
	public void deleteMember(Scanner sc) {
		// TODO Auto-generated method stub
		System.out.print("������ ��ȣ �Է�>> ");
		dao.delete(sc.nextInt());
	}

	@Override
	public void getAll() {
		// TODO Auto-generated method stub
		ArrayList<Member> list;
		
		list = dao.selectAll();
		
		for (Member m : list) {
			System.out.println(m);
		}
	}

	@Override
	public void editMember(Scanner sc) {
		// TODO Auto-generated method stub
		Member m = new Member();
		System.out.print("������ ��ȣ>> ");
		m.setNum(sc.nextInt());
		System.out.print("������ �̸�>> ");
		m.setName(sc.next());
		System.out.print("������ ��ȭ��ȣ>> ");
		m.setTel(sc.next());
		System.out.print("������ �ּ�>> ");
		m.setAddress(sc.next());
		
		dao.update(m);
	}

}
