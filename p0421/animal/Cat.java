package p0421.animal;

public class Cat extends Animal {

	@Override
	public void cry() {
		// TODO Auto-generated method stub
		super.cry();
		System.out.println("야~~용");
	}
	
	public void grooming() {
		System.out.println("그루밍 한다.");
	}

}
