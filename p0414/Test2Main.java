package p0414;
class Test2 {
	int a;
	static int b;
	
	void test1() {
		//일반 메서드 - Static 변수와 일반 변수 사용 가능
		System.out.println(a);
		System.out.println(b);
	}
	
	static void test2() {
		//static 메서드. 메서드는 무조건 Stack에 할당. 객체 유무와 상관 없음
		//System.out.println(a); Static 메서드 사용 불가
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

//static 메서드의 사용
//1. 객체 생성 전에 static 멤버 변수를 다루고자 할 때
//2. 객체와 상관 없이 기능을 단독으로 제공하고자 할 떄
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
