package p0420.p1;

public class Child extends Parent {
	String hobby;

	public Child(String name, int age, String hobby) {
		super(name, age);
		this.hobby = hobby;
	}

	@Override
	public void printPerson() {
		// TODO Auto-generated method stub
		//super.printPerson();
		System.out.println("name:" + name + "|age:" + age + "|hobby" + hobby);
	}
	
}
