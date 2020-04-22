package p0421;

public class Service {
	//부품이 교체될 수 있도록 Interface 타입으로 선언 
	//-> Upcasting이 가능해야 하기 때문
	private Dao dao;
	
	//의존성 주입
	public Service (Dao dao) {
		this.dao = dao;
	}
	
	public void add() {
		dao.insert();
	}
	
	public void get() {
		dao.select();
	}
	
	public void edit() {
		dao.update();
	}
	
	public void delete() {
		dao.delete();
	}
}
