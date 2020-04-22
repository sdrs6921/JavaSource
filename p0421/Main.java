package p0421;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Service service = new Service(new DaoImplMs());
		service.add();
		service.get();
		service.edit();
		service.delete();
	}

}
