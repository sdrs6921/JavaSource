package p0414;
class StaticTest {
	int a;
	static int b;
	
	void addNum() {
		a++;
		b++;
	}
	
	void printNum() {
		System.out.println("a:" + a);
		System.out.println("b:" + b);
	}
}

public class Test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(StaticTest.b);
		StaticTest st1 = new StaticTest();
		st1.addNum();
		st1.printNum();
		
		StaticTest st2 = new StaticTest();
		st2.addNum();
		st2.printNum();
		
		StaticTest st3 = new StaticTest();
		st3.addNum();
		st3.printNum();
		
		//Static ������ ������ �� Class�� �̸����� �����ؾ� Warning�� �ȶ�
		//Class ������ Statc ������ Class ������� ��.
		System.out.println(StaticTest.b);
		System.out.println(StaticTest.b);
		System.out.println(StaticTest.b);
	}

}
