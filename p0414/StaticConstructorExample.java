package p0414;

import HomeWork1.Factory.Product;

class CountObject {
	static int count;
	
	CountObject() {
		count++;
	}
	
	void printObjectNum() {
		System.out.println(count + "개의 객체가 생성되었음");
	}
}

public class StaticConstructorExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Product p1 = new Product("딸기", 1000, 20);
		Product p2 = new Product("과자", 2000, 30);
		
		p1.toString();
		p2.toString();
	}

}
