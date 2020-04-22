package p0421.shape;

public class Rectangle extends Shape{

	public Rectangle(Point[] p) {
		name = "»ç°¢Çü";
		points = p;
	}

	@Override
	public void draw() {
		// TODO Auto-generated method stub
		super.draw();
		
		for (int i = 0; i < points.length; i++) {
			System.out.print(points[i].toString() + " ");
		}
		System.out.println();
	}
}
