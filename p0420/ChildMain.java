package p0420;

class GrandParent {
	private int a;
	int b;
	protected int c;
	public int d;
	
	public GrandParent() {
		System.out.println("Grand Parent 생성자");
		a = 1;
		b = 2;
		c = 3;
		d = 4;
	}
	
	public void gpMethod() {
		System.out.println("Grand Parent Method");
		System.out.println("a:" + a + "/b:" + b + "/c:" + c + "/d:" + d);
	}
	
}

class Parent extends GrandParent {
	//부모 메서드와 속성 중 private과 생성자를 받지 모삼
	public String name;
	
	public Parent() {
		System.out.println("Parent 생성자");
		name = "parent";
		//a = 1;
		b = 20;
		c = 30;
		d = 40;
	}
	
	public void pMethod() {
		System.out.println("Parent Method!");
		System.out.println("name:" + name + "/b:" + b + "/c:" + c + "/d:" + d);
	}
}

class Child extends Parent {
	public String hobby;
	
	public Child() {
		System.out.println("Child 생성자");
		name = "child";
		hobby = "유투브";
		//a = 1
		b = 200;
		c = 300;
		d = 400;
	}
	
	public void cMethod() {
		System.out.println("Child Method!");
		System.out.println("name:" + name + "/b:" + b + "/c:" + c + "/d:" + d + "/hobby:" + hobby);
	}
}
public class ChildMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GrandParent gp = new GrandParent();
		gp.gpMethod();
		
		System.out.println("=================");
		
		Parent p = new Parent();
		p.gpMethod();
		p.pMethod();
		
		System.out.println("=================");
		
		Child c = new Child();
		c.gpMethod();
		c.pMethod();
		c.cMethod();
	}

}
