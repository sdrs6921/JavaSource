package p0414;
class Test2 {
	int a;
	static int b;
	
	void test1() {
		//�Ϲ� �޼��� - Static ������ �Ϲ� ���� ��� ����
		System.out.println(a);
		System.out.println(b);
	}
	
	static void test2() {
		//static �޼���. �޼���� ������ Stack�� �Ҵ�. ��ü ������ ��� ����
		//System.out.println(a); Static �޼��� ��� �Ұ�
		System.out.println(b);
	}
	
	void test3() {
		test1();
		test2();
	}
	
	static void test4() {
		//test1();
		test2();
	}
}

//static �޼����� ���
//1. ��ü ���� ���� static ��� ������ �ٷ���� �� ��
//2. ��ü�� ��� ���� ����� �ܵ����� �����ϰ��� �� ��
public class Test2Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Test2.b = 30;
		Test2.test2();
		Test2.test4();
		
		Test2 t = new Test2();
		t.test1();
		Test2.test2();
		t.test3();
		Test2.test4();
		
		System.out.println(Math.PI);
		System.out.println(Math.abs(-10));
	}

}
