package p0420;

class GrandParent {
	private int a;
	int b;
	protected int c;
	public int d;
	
	public GrandParent() {
		System.out.println("Grand Parent ������");
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
	//�θ� �޼���� �Ӽ� �� private�� �����ڸ� ���� ���
	public String name;
	
	public Parent() {
		System.out.println("Parent ������");
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
		System.out.println("Child ������");
		name = "child";
		hobby = "������";
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
