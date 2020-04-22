package p0421.shape;

public class ShapeMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Object[] objarr = new Object[5];
		
		//Up casting : 타입이 위로 올라감
		objarr[0] = new Shape();
		objarr[1] = new Circle(1, 2, 3);
		objarr[2] = "abc";
		objarr[3] = 3.14f;
		objarr[4] = 10;
		
		//DownCasting Upcasting된 객체를 원래 타입으로 내림
		Shape s = (Shape)objarr[0];
		s.draw();
		
		Circle c = (Circle)objarr[1];
		c.draw();
		
		String str = (String)objarr[2];
		System.out.println(str);
		
		float f = (Float)objarr[3];
		System.out.println(f);
		
		int i = (Integer)objarr[4];
		System.out.println(i);
	}

}
