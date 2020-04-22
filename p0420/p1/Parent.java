package p0420.p1;

public class Parent {
	String name;
	int age;
	
	public Parent(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}



	public void printPerson() {
		System.out.println("name:" + name + "|age:" + age);
	}
}
