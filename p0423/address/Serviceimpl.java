package p0423.address;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
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
		System.out.println("새로운 사람을 등록합니다.");
		System.out.print("이름>>");
		m.setName(sc.next());
		System.out.print("전화번호>>");
		m.setTel(sc.next());
		System.out.print("주소>>");
		m.setAddress(sc.next());
		
		dao.insert(m);
	}

	@Override
	public void getMember(Scanner sc) {
		// TODO Auto-generated method stub
		System.out.print("검색할 사람의 이름>>");
		Member m = dao.select(sc.next());
		System.out.println(m.toString());
	}

	@Override
	public void getAll() {
		// TODO Auto-generated method stub
		ArrayList<Member> datas = dao.selectAll();
		System.out.println("전화번호부 목록을 전부 출력합니다.");
		for (Member m : datas) {
			System.out.println(m.toString());
		}
	}

	@Override
	public void editMember(Scanner sc) {
		// TODO Auto-generated method stub
		Member m = new Member();
		System.out.print("수정할 사람의 이름을 입력해주세요 >>");
		m.setName(sc.next());
		System.out.print("전화번호>>");
		m.setTel(sc.next());
		System.out.print("주소>>");
		m.setAddress(sc.next());
		
		Member m2 = dao.select(m.getName());
		
		if (m2 == null) {
			System.out.println(m.getName() + "이라는 이름이 검색되지 않았습니다.");
			return;
		}
		dao.update(m);
		System.out.println("수정이 완료되었습니다.");
	}

	@Override
	public void delMember(Scanner sc) {
		// TODO Auto-generated method stub
		System.out.print("삭제할 사람의 이름을 입력해주세요 >>");
		dao.delete(sc.next());
	}

	@Override
	public void FileSave() {
		// TODO Auto-generated method stub
		//Save all Member
		ArrayList<Member> datas = dao.selectAll();
		String path = "src/p0423/address/data/data.dat";
		
		try {
			ObjectOutputStream oo = new ObjectOutputStream(new FileOutputStream(path));
			
			for (Member m : datas) {
				oo.writeObject(m);
			}
			oo.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public void FileLoad() {
		// TODO Auto-generated method stub
		String path = "src/p0423/address/data/data.dat";
		
		try {
			FileInputStream fi = new FileInputStream(path);
			ObjectInputStream oi = new ObjectInputStream(fi);
			
			while (fi.available() > 0) {
				Member m = (Member) oi.readObject();
				dao.insert((Member) m);
			}
			
			oi.close();
			fi.close();

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			if (e instanceof EOFException) {
				System.out.println("읽을 데이터가 없다.");
			} else {
				e.printStackTrace();
			}
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}

}
