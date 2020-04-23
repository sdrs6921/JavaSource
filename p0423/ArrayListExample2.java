package p0423;

import java.util.ArrayList;
import java.util.Scanner;

class A1 {
	int x;

	public A1(int x) {
		this.x = x;
	}

	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		if (obj != null && obj instanceof A1) {
			A1 obj2 = (A1) obj;
			if (this.x == obj2.x) {
				return true;
			}
		}

		return false;
	}

	@Override
	public String toString() {
		return "A1 [x=" + x + "]";
	}

}

public class ArrayListExample2 {

	public static void printAll(ArrayList<A1> a1) {
		for (A1 a : a1) {
			System.out.print(a + " ");
		}
		System.out.println();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		ArrayList<A1> a1 = new ArrayList<A1>();

		// 5개의 element 추가
		for (int i = 1; i < 6; i++) {
			a1.add(new A1(i));
		}

		printAll(a1);

		a1.set(1, new A1(20));// 새 객체로 교체

		printAll(a1);
		/*
		 * A1 tmp = a1.get(1); tmp.x = 20;
		 */

		// equals를 재정의 하지 않고 사용할 때
		int i;

		for (i = 0; i < a1.size(); i++) {
			A1 tmp = a1.get(i);

			if (tmp.x == 3) {
				System.out.println(i + "번째에 위치해 있음");
				break;
			}
		}

		A1 k = new A1(3);
		if (a1.contains(k)) {
			System.out.println(a1.indexOf(k));
		}

		if (i == a1.size()) {
			System.out.println("없다");
		}
		
		A1 t = new A1(4);
		
		a1.remove(a1.indexOf(t));
		printAll(a1);
	}

}
