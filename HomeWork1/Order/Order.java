package HomeWork1.Order;

import HomeWork1.Factory.Product;

public class Order {
	private int num;
	private int prodNumber;
	private int amount;
	private int totalPrice;
	private boolean isPaid;
	private static int cnt;

	public Order() {

	}

	public Order(Product p, int amount) {
		this.num = ++cnt;
		this.prodNumber = p.getNum();
		this.amount = amount;
		this.totalPrice = p.getPrice() * amount;
	}

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	public int getProdNumber() {
		return prodNumber;
	}

	public void setProdNumber(int prodNumber) {
		this.prodNumber = prodNumber;
	}

	public int getAmount() {
		return amount;
	}

	public void setAmount(int amount) {
		this.amount = amount;
	}

	public int getTotalPrice() {
		return totalPrice;
	}

	public void setTotalPrice(int totalPrice) {
		this.totalPrice = totalPrice;
	}

	public boolean isPaid() {
		return isPaid;
	}

	public void setPaid(boolean isPaid) {
		this.isPaid = isPaid;
	}

}
