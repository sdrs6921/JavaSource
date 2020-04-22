package p0414;

public class Test8 {
	private int a; 	// private
	int b;			// default
	public int c; 	// public

	public Test8() {
		a = 1;
		b = 2;
		c = 3;
	}

	public void printMem() {
		System.out.println("a:" + a);
		System.out.println("b:" + b);
		System.out.println("c:" + c);
	}
	
	//private Method
	private void test1() {
		System.out.println("클래스 내부에서 호출");
	}
	
	//default Method
	void test2() {
		System.out.println("패키지 내에서만 호출");
	}
	
	//public method
	public void test3() {
		System.out.println("패키지 밖에서도 호출");
	}
}
