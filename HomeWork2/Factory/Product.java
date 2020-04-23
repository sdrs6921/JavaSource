package HomeWork2.Factory;

public class Product {
	private static int cnt;
	private int num;
	private String name;
	private int price;
	private int amount;
	
	public Product() {
		super();
	}

	public Product(String name, int price, int amount) {
		this.num = ++cnt;
		this.name = name;
		this.price = price;
		this.amount = amount;
	}
	
	

	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		if (obj != null && obj instanceof Product) {
			Product p = (Product)obj;
			if (num == p.num) {
				return true;
			}
		}
		return false;
	}

	@Override
	public String toString() {
		return "[제품 번호:" + num + " 제품명:" + name + " 가격:" + price + " 수량:" + amount + "]";
	}

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public int getAmount() {
		return amount;
	}

	public void setAmount(int amount) {
		this.amount = amount;
	}
	
	
}
