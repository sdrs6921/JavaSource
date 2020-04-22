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


//자바에서 상속은 단일 상속만 가능 (부모는 1개만 가능)