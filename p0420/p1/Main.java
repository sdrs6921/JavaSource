package p0420.p1;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Parent p = new Parent("parent", 41);
		p.printPerson();
		System.out.println("===============");
		Child c = new Child("child", 7, "취미");
		c.printPerson();
		
		//재정의 된 메서드의 정적 결합 : 컴파일 시 결정. 타입을 따라감
		//자식 객체에서는 재정의 된 메스드가 실행. 부모 것을 호출하고 싶으면 super
		//super:부모 객체. super():부모 객체 생성자 호출
		
		
		//업캐스팅. 객체 타입만 가능. 상속관계끼리 캐스팅. 부모 행세 붐 클래스에 정의한 멤버만 사용 가능
		Parent cp = new Child("Upcasting", 11, "up");
		cp.printPerson();//UP캐스팅 재정의된 메서드의 동적 결합
	}

}
