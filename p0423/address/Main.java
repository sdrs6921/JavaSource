package p0423.address;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dao dao = new Daoimpl();
		Service service = new Serviceimpl(dao);
		Menu menu = new Menu(service);
		
		menu.run(new Scanner(System.in));
	}

}
