package p0421.animal;

public class Dog extends Animal{
	
	@Override
	public void cry() {
		super.cry();
		System.out.println("¸Û¸Û");
	}
	
	public void run() {
		System.out.println(name + "°¡ ¶Ú´Ù.");
	}
}
