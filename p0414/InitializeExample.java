package p0414;

class Init {
	// 1.��� ������ �⺻ �� �Ҵ�
	int a = 1;
	static int b = 2;

	// 2. �ʱ�ȭ ��Ͽ� ���� �ʱ�ȭ
	{
		System.out.println("�Ϲ� ��� �ʱ�ȭ ���");
		System.out.println("a:" + a);
		System.out.println("b:" + b);
		a = 10;
	}
	static {
		System.out.println("static ��� �ʱ�ȭ ���");
		// System.out.println("a:" + a); //error
		System.out.println("b:" + b);
		b = 20;
	}

	// 3. �����ڿ� ���� �ʱ�ȭ
	Init() {
		System.out.println("������");
		System.out.println("a:" + a);
		System.out.println("b:" + b);
		a = 30;
		b = 40;
	}
	
	void printMem() {
		System.out.println("print �޼���");
		System.out.println("a:" + a);
		System.out.println("b:" + b);
	}
}

public class InitializeExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Init init = new Init();
		init.printMem();
	}

}
