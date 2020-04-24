package HomeWork2.Order;

import java.util.ArrayList;
import java.util.Scanner;

import HomeWork2.Factory.Product;

public interface Service {
	public void addOrder(Scanner sc , ArrayList <Product> prods);
	
	public void printOrder(Scanner sc);
	
	public void pay(Scanner sc);
	
	public void delOrder(Scanner sc);
	
	ArrayList<Order> getOutList();	
}
