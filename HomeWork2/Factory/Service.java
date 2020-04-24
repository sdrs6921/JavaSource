package HomeWork2.Factory;

import java.util.ArrayList;
import java.util.Scanner;

import HomeWork2.Order.Order;

public interface Service {
	void addProduct(Scanner sc);

	void printProduct(Scanner sc);

	void printAll();

	void getByName(Scanner sc);

	void editPrice(Scanner sc);

	void in(Scanner sc);

	void out(ArrayList<Order> order);

	void delProduct(Scanner sc);

	ArrayList<Product> getAll();

	Product getByNum(int num);
}
