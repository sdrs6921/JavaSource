package HomeWork2.Factory;

import java.util.ArrayList;

public interface DAO {
	void insert(Product p);

	int getIdByNum(int num);

	Product selectByNum(int num);

	Product[] selectByName(String name);

	Product[] selectAll();

	void updatePrice(Product p);

	boolean in_out(Product p);

	void delete(int num);
	
	ArrayList<Product> selectByName2(String name);
	
	ArrayList<Product> selectAll2();
}
