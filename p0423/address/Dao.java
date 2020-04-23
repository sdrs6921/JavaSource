package p0423.address;

import java.util.ArrayList;

public interface Dao {
	void insert(Member m);
	
	Member select(String name);
	
	ArrayList<Member> selectAll();
	
	void update(Member m);
	
	void delete(String name);
}
