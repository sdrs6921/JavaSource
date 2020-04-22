package p0410;
class Product {
	int productId;
	String productName;
	int price;
	int quantity;
	
	void setInfo(int pid, String name, int pri, int quant) {
		productId = pid;
		productName = name;
		price = pri;
		quantity = quant;
	}
	
	void printProductInfo() {
		System.out.println("ProductID:" + productId);
		System.out.println("Name:" + productName);
		System.out.println("Price:" + price);
		System.out.println("Quantity:" + quantity);
	}
}
public class ProductManagementExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Product p = new Product();
	
		p.setInfo(11423, "ÇÜ¹ö°Å", 4900, 100);
		p.printProductInfo();
		
	}

}
