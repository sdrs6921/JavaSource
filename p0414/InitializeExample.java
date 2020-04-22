package p0414;

class Init {
	// 1.멤버 변수에 기본 값 할당
	int a = 1;
	static int b = 2;

	// 2. 초기화 블록에 의한 초기화
	{
		System.out.println("일반 멤버 초기화 블록");
		System.out.println("a:" + a);
		System.out.println("b:" + b);
		a = 10;
	}
	static {
		System.out.println("static 멤버 초기화 블록");
		// System.out.println("a:" + a); //error
		System.out.println("b:" + b);
		b = 20;
	}

	// 3. 생성자에 의한 초기화
	Init() {
		System.out.println("생성자");
		System.out.println("a:" + a);
		System.out.println("b:" + b);
		a = 30;
		b = 40;
	}
	
	void printMem() {
		System.out.println("print 메서드");
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
