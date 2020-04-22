package p0421;

//완전 추상클래스(상수, 추상메서드) interface 키워드 사용., 객체 생성 불가
//다중 상속 가능
//인터페이스의 활용. 다중 상속이 필요한 경우 및 컴포넌트 연결
public interface MyInter {
	int max = 100;

	void test1();

	void test2();
}

class MyInterImpl implements MyInter {

	@Override
	public void test1() {
		// TODO Auto-generated method stub
		System.out.println("test1" + max);
	}

	@Override
	public void test2() {
		// TODO Auto-generated method stub
		System.out.println("test2");
	}
	
}
