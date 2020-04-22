package HomeWork2.Factory;

import HomeWork2.Factory.Product;

public interface DAO {
	void insert(Product p);

	int getIdByNum(int num);

	Product selectByNum(int num);

	Product[] selectByName(String name);

	Product[] selectAll();

	void updatePrice(Product p);

	boolean in_out(Product p);

	void delete(int num);
}
