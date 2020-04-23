package p0423.address;

import java.util.ArrayList;

public class Daoimpl implements Dao {
	private ArrayList<Member> datas;

	public Daoimpl() {
		// TODO Auto-generated constructor stub
		datas = new ArrayList<Member>();
	}

	@Override
	public void insert(Member m) {
		// TODO Auto-generated method stub
		if (datas.contains(m)) {
			// equals�� ������ �� ���� ��ü�� m�̶� ������ ��
			System.out.println("�ߺ��� �̸��Դϴ�. ����� �� �����ϴ�.");
		} else {
			datas.add(m);
		}
	}

	@Override
	public Member select(String name) {
		// TODO Auto-generated method stub
		Member m = new Member(name, "", "");
		int idx = datas.indexOf(m);
		
		if (idx >= 0) {
			return datas.get(idx);
		}
		
		return null;
		/*
		 * for (Member m : datas) { if (m.getName().equals(name)) { return m; }
		 * }
		 */
	}

	@Override
	public ArrayList<Member> selectAll() {
		// TODO Auto-generated method stub
		return datas;
	}

	@Override
	public void update(Member m) {
		// TODO Auto-generated method stub
		int idx = datas.indexOf(m);
		
		if (idx < 0) {
			System.out.println("��ϵ��� ���� �̸��Դϴ�.");
		} else {
			datas.set(idx, m);
		}
	}

	@Override
	public void delete(String name) {
		// TODO Auto-generated method stub
		datas.remove(new Member(name, "", ""));
	}

}
