package p0422;

import java.util.Scanner;

class Test implements Cloneable {
	private int a;
	private int b;

	public Test() {

	}

	public Test(int a, int b) {
		this.a = a;
		this.b = b;
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
	}

	@Override
	public String toString() {
		return "Test [a=" + a + ", b=" + b + "]";
	}

	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		if (obj != null && obj instanceof Test) {
			Test obj2 = (Test) obj;
			if (a == obj2.a && b == obj2.b) {
				return true;
			}
		}
		return false;
	}
}

// Object class의 equals는 두 객체를 ==로 비교한 것
// String class는 equals가 재 정의 되어있다. 그러나 대부분의 class는 재정의 되어 있지 않음
public class Test1Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Test t1 = new Test(3, 4);
		Test t2 = null;
		Test t3 = t1; // 얕은 복사

		try {
			t2 = (Test) t1.clone();
		} catch (CloneNotSupportedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		System.out.println("t1:" + t1);
		System.out.println("t2:" + t2);
		System.out.println("t3:" + t3);
		System.out.println("t1 참조값:" + t1.hashCode());
		System.out.println("t2 참조값:" + t2.hashCode());
		System.out.println("t3 참조값:" + t3.hashCode());
		System.out.println("t1 == t2:" + (t1 == t2));
		System.out.println("t1 == t3:" + (t1 == t3));
		System.out.println("t1.equals(t2):" + t1.equals(t2));
		System.out.println("t1.equals(t3):" + t1.equals(t3));

		/*
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		char opt = ' ';
		int num1 = 0, num2 = 0, res = 0;
		boolean flag = true;

		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			if (flag && Character.isDigit(ch)) {
				num1 = (num1 * 10) +  (ch - '0');
			} else if (!flag && Character.isDigit(ch)) {
				num2 = (num2 * 10) + (ch - '0');
			} else {
				System.out.println(ch);
				opt = ch;
				flag = false;
			}
		}
		
		System.out.println(num1);
		System.out.println(opt);
		System.out.println(num2);

		switch (opt) {
		case '+':
			res = num1 + num2;
			break;
		case '-':
			res = num1 - num2;
			break;
		case '*':
			res = num1 * num2;
			break;
		case '/':
			res = num1 / num2;
			break;
		}
		
		System.out.println("res:" + res);*/
		
		String str = "123-45";
		
		String[] s = str.split("-");
		int[] nums = new int[3];
		
		for (int i = 0; i < 2; i++) {
			nums[i] = Integer.parseInt(s[i]);
		}
		
		nums[2] = nums[0] - nums[1];
		System.out.println(nums[0] + "-"  + nums[1] + "=" + nums[2]);
	}
	
}
