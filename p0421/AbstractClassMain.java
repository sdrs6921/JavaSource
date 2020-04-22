package p0421;

//추상 클래스는 미완성이기 때문에 객체를 만들 수 없음.
//객체를 만들고 싶으면 상속을 받아서 추상 메소드 구현
abstract class GrandParent {
	public abstract void test1();

	public abstract void test2();

	public void test3() {
		System.out.println("이 메서드는 GrandParent 에서 구현");
	}
}

abstract class Parent extends GrandParent {

	@Override
	public void test1() {
		// TODO Auto-generated method stub
		System.out.println("이 멧드는 Parent에서 구현");
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
