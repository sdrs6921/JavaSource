package p0414;

import HomeWork1.Factory.Product;

class CountObject {
	static int count;
	
	CountObject() {
		count++;
	}
	
	void printObjectNum() {
		System.out.println(count + "���� ��ü�� �����Ǿ���");
	}
}

public class StaticConstructorExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Product p1 = new Product("����", 1000, 20);
		Product p2 = new Product("����", 2000, 30);
		
		p1.toString();
		p2.toString();
	}

}
