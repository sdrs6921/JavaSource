package p0420;
class Car {
	String name;
	
	public void beep() {
		System.out.println("����");
	}
}

class �ҹ��� extends Car{
	public �ҹ���() {
		name = "�ҹ���";
	}
	
	@Override
	public void beep() {
		System.out.println("�־־־־�");
	}
}

class ����� extends Car {
	
	public �����() {
		// TODO Auto-generated constructor stub
		name = "�����";
	}
	
	@Override
	public void beep() {
		System.out.println("���Ķ���");
	}
}

class �ں深�� extends Car {
	public �ں深��() {
		// TODO Auto-generated constructor stub
		name = "�ں深��";
	}
	
	@Override
	public void beep() {
		System.out.println("�߻ǻ߻�");
	}
}

public class CarMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car c = null;
		c = new �ҹ���();
		c.beep();
	}
}
