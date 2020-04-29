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
		System.out.print("이름>> ");
		m.setName(sc.next());
		System.out.print("전화번호>> ");
		m.setTel(sc.next());
		System.out.print("주소>> ");
		m.setAddress(sc.next());
		
		dao.insert(m);
	}

	@Override
	public void getMember(Scanner sc) {
		// TODO Auto-generated method stub
		System.out.print("검색할 번호>> ");
		Member m = dao.selectByNum(sc.nextInt());
		if (m == null) {
			System.out.println("검색한 번호가 존재하지 않습니다.");
		} else {
			System.out.println(m);
		}
	}

	@Override
	public void getByName(Scanner sc) {
		// TODO Auto-generated method stub
		ArrayList<Member> list;
		System.out.print("검색할 이름>> ");
		list = dao.selectByName(sc.next());
		
		if (list.size() <= 0) {
			System.out.println("검색 결과가 없습니다.");
		} else {
			for (Member m : list) {
				System.out.println(m);
			}
		}
	}

	@Override
	public void deleteMember(Scanner sc) {
		// TODO Auto-generated method stub
		System.out.print("삭제할 번호 입력>> ");
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
		System.out.print("수정할 번호>> ");
		m.setNum(sc.nextInt());
		System.out.print("수정할 이름>> ");
		m.setName(sc.next());
		System.out.print("수정할 전화번호>> ");
		m.setTel(sc.next());
		System.out.print("수정할 주소>> ");
		m.setAddress(sc.next());
		
		dao.update(m);
	}

}
