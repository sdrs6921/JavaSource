package p0420;
class Car {
	String name;
	
	public void beep() {
		System.out.println("»§»§");
	}
}

class ¼Ò¹æÂ÷ extends Car{
	public ¼Ò¹æÂ÷() {
		name = "¼Ò¹æÂ÷";
	}
	
	@Override
	public void beep() {
		System.out.println("¾Ö¾Ö¾Ö¾Ö¾Þ");
	}
}

class ±¼»è±â extends Car {
	
	public ±¼»è±â() {
		// TODO Auto-generated constructor stub
		name = "±¼»è±â";
	}
	
	@Override
	public void beep() {
		System.out.println("¶¥ÆÄ¶¥ÆÄ");
	}
}

class ¾Úºæ·±½º extends Car {
	public ¾Úºæ·±½º() {
		// TODO Auto-generated constructor stub
		name = "¾Úºæ·±½º";
	}
	
	@Override
	public void beep() {
		System.out.println("»ß»Ç»ß»Ç");
	}
}

public class CarMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car c = null;
		c = new ¼Ò¹æÂ÷();
		c.beep();
	}
}
