package p0420;

public class Son extends Father {
	public void test() {
		System.out.println("Son Method");
		System.out.println("/b:" + b + "/c:" + c + "/d:" + d);
	}
}

class Other {
	private Father f;
	
	public Other() {
		f = new Father();
	}
	
	public void test() {
		System.out.println("Other Method");
		System.out.println("/b:" + f.b + "/c:" + f.c + "/d:" + f.d);
	}
}


//�ڹٿ��� ����� ���� ��Ӹ� ���� (�θ�� 1���� ����)