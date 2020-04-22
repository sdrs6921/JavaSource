package p0414;

class Test4 {
	String name;
	int age;
	
	Test4() {
		
	}
	
	Test4(String n, int a) {
		//생성자
		name = n;
		age = a;
	}

	void printInfo() {
		System.out.println("name:" + name);
		System.out.println("age:" + age);
	}
}

public class Test4Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//생성자를 따로 만들지 않으면 컴파일러가 생성자를 직접 만든다.
		Test4 t = new Test4("엄희상", 27);
		t.printInfo();

	}

}
