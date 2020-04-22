package p0420.PoketMon;

//하위 클래스의 공통점을 뽑아서 상속해 줄 상위 클래스에 정의
//동일한 코드의 반복을 방지
//동일한 기능을 상위에 메서들 정의하고 상속받는 하위 클래스에서는 그클래스에 적합하게 재정의해서 사용
//하위 클래스에 레이아웃을 설정


abstract public class PoketMon {
	protected String name;
	protected int hp;
	protected int exp;
	protected int level = 1;

	abstract public void eat();

	abstract public void sleep();

	abstract public boolean play();

	abstract public boolean exercise();

	abstract public void levelCheck();

	public void printInfo() {
		System.out.println(name + "상태정보");
		System.out.println("hp:" + hp);
		System.out.println("exp:" + exp);
		System.out.println("level:" + level);
	}
}
