package p0429.jdbc.addr;

import java.util.ArrayList;

public interface Dao {
	void insert(Member m);
	
	ArrayList<Member> selectByName(String name);
	
	Member selectByNum(int num);
	
	ArrayList<Member> selectAll();
	
	void update(Member m);
	
	void delete(int name);
}
