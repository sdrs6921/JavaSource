package p0421;

//�߻� Ŭ������ �̿ϼ��̱� ������ ��ü�� ���� �� ����.
//��ü�� ����� ������ ����� �޾Ƽ� �߻� �޼ҵ� ����
abstract class GrandParent {
	public abstract void test1();

	public abstract void test2();

	public void test3() {
		System.out.println("�� �޼���� GrandParent ���� ����");
	}
}

abstract class Parent extends GrandParent {

	@Override
	public void test1() {
		// TODO Auto-generated method stub
		System.out.println("�� ���� Parent���� ����");
	}

}

class Child extends Parent {

	@Override
	public void test2() {
		// TODO Auto-generated method stub
		
	}
	
}


public class AbstractClassMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyInterImpl ml = new MyInterImpl();
		ml.test1();
		ml.test2();
	}

}
