package p0423.address;

import java.util.ArrayList;
import java.util.Scanner;

public class Serviceimpl implements Service {
	private Dao dao;
	
	public Serviceimpl(Dao dao) {
		// TODO Auto-generated constructor stub
		this.dao = dao;
	}
	
	@Override
	public void addMember(Scanner sc) {
		// TODO Auto-generated method stub
		Member m = new Member();
		System.out.println("���ο� ����� ����մϴ�.");
		System.out.print("�̸�>>");
		m.setName(sc.next());
		System.out.print("��ȭ��ȣ>>");
		m.setTel(sc.next());
		System.out.print("�ּ�>>");
		m.setAddress(sc.next());
		
		dao.insert(m);
	}

	@Override
	public void getMember(Scanner sc) {
		// TODO Auto-generated method stub
		System.out.print("�˻��� ����� �̸�>>");
		Member m = dao.select(sc.next());
		System.out.println(m.toString());
	}

	@Override
	public void getAll() {
		// TODO Auto-generated method stub
		ArrayList<Member> datas = dao.selectAll();
		System.out.println("��ȭ��ȣ�� ����� ���� ����մϴ�.");
		for (Member m : datas) {
			System.out.println(m.toString());
		}
	}

	@Override
	public void editMember(Scanner sc) {
		// TODO Auto-generated method stub
		Member m = new Member();
		System.out.print("������ ����� �̸��� �Է����ּ��� >>");
		m.setName(sc.next());
		System.out.print("��ȭ��ȣ>>");
		m.setTel(sc.next());
		System.out.print("�ּ�>>");
		m.setAddress(sc.next());
		
		Member m2 = dao.select(m.getName());
		
		if (m2 == null) {
			System.out.println(m.getName() + "�̶�� �̸��� �˻����� �ʾҽ��ϴ�.");
			return;
		}
		dao.update(m);
		System.out.println("������ �Ϸ�Ǿ����ϴ�.");
	}

	@Override
	public void delMember(Scanner sc) {
		// TODO Auto-generated method stub
		System.out.print("������ ����� �̸��� �Է����ּ��� >>");
		dao.delete(sc.next());
	}

}
