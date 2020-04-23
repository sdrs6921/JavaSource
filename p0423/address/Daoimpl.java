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
			// equals를 가지고 각 방의 객체가 m이랑 같은지 비교
			System.out.println("중복된 이름입니다. 등록할 수 없습니다.");
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
			System.out.println("등록되지 않은 이름입니다.");
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
