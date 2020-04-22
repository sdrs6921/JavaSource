package HomeWork2.Factory;

import java.util.Scanner;

public interface Service {
	void addProduct(Scanner sc);

	void printProduct(Scanner sc);

	void printAll();

	void getByName(Scanner sc);

	void editPrice(Scanner sc);

	void in(Scanner sc);

	void out(Scanner sc);

	void delProduct(Scanner sc);
	
	Product getByNum(Scanner sc, int num);
	
	Product[] getAll();

	Product getByNum(int num);
}
