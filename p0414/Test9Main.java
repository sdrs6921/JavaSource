package p0414;

class Test9 {
	private int age;
	private String name;

	public Test9() {

	}

	public Test9(int age, String name) {
		this.age = age;
		this.name = name;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
	public int getAge() {
		return age;
	}
}

public class Test9Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Test9 test9 = new Test9(26, "Eom");
		
		test9.setAge(27);
		
		System.out.println("Name:" + test9.getName());
		System.out.println("Age:" + test9.getAge());
		
		Test9 t2 = new Test9(23, "BBB");
		
		System.out.println("Name:" + t2.getName());
		System.out.println("Age:" + t2.getAge());
	}

}
