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
		System.out.println("Ŭ���� ���ο��� ȣ��");
	}
	
	//default Method
	void test2() {
		System.out.println("��Ű�� �������� ȣ��");
	}
	
	//public method
	public void test3() {
		System.out.println("��Ű�� �ۿ����� ȣ��");
	}
}
