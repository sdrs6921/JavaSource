package p0414;

class Test4 {
	String name;
	int age;
	
	Test4() {
		
	}
	
	Test4(String n, int a) {
		//������
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
		//�����ڸ� ���� ������ ������ �����Ϸ��� �����ڸ� ���� �����.
		Test4 t = new Test4("�����", 27);
		t.printInfo();

	}

}
