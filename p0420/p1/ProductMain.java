package p0420.p1;

class Product {
	String name;
	int price;
	int point;
}

class Tv extends Product {
	public Tv() {
		name = "tv";
		price = 1000;
		point = 100;
	}
}

class Audio extends Product {
	public Audio() {
		name = "Audio";
		price = 2000;
		point = 200;
	}
}

class Computer extends Product {
	public Computer() {
		name = "Computer";
		price = 3000;
		point = 300;
	}
}

class Buyer {
	int money = 10000;
	int point;

	public void buy(Product p) {
		if (p.price <= money) {
			money -= p.price;
			point += p.point;
		} else {
			System.out.println("ÀÜ¾× ºÎÁ·");
		}

		printInfo();
	}

	public void printInfo() {
		System.out.println("ÀÜ¾×:" + money);
		System.out.println("Æ÷ÀÎÆ®:" + point);
	}

	/* Method Overloading */
	// public void buy(Audio p) {
	// if (p.price <= money) {
	// money -= p.price;
	// point += p.point;
	// } else {
	// System.out.println("ÀÜ¾× ºÎÁ·");
	// }
	// }
	//
	// public void buy(Computer p) {
	// if (p.price <= money) {
	// money -= p.price;
	// point += p.point;
	// } else {
	// System.out.println("ÀÜ¾× ºÎÁ·");
	// }
	// }
	//

}

public class ProductMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Product[] pArr = { new Tv(), new Audio(), new Computer(), new Tv(), new Computer(), new Audio(), new Computer(),
				new Tv(), new Computer(), new Audio() };
		Buyer b = new Buyer();
		for (int i = 0 ; i < pArr.length; i++) {
			b.buy(pArr[i]);
		}
		// Buyer b = new Buyer();
		// b.buy(new Tv());
		// b.buy(new Audio());
		// b.buy(new Computer());
		// b.buy(new Tv());
		// b.buy(new Audio());
		// b.buy(new Computer());
		// b.buy(new Tv());
		// b.buy(new Audio());
		// b.buy(new Computer());
	}

}
