package HomeWork2.Order;

import HomeWork2.Factory.Product;

public class Order {
	private int num;
	private Product product;
	private int amount;
	private int totalPrice;
	private boolean isPaid;
	private boolean isReleased;
	private static int cnt;

	public Order() {

	}

	public Order(Product product, int amount) {
		this.num = ++cnt;
		this.product = product;
		this.amount = amount;
		this.totalPrice = product.getPrice() * amount;
	}

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
		this.product = product;
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

	public boolean isReleased() {
		return isReleased;
	}

	public void setReleased(boolean isReleased) {
		this.isReleased = isReleased;
	}

	@Override
	public String toString() {
		return "Order [num=" + num + ", product=" + product + ", amount=" + amount + ", totalPrice=" + totalPrice
				+ ", isPaid=" + isPaid + ", isReleased=" + isReleased + "]";
	}

	
}
