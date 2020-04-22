package p0421.shape;

public class Circle extends Shape {
	private int r;

	public Circle(Point[] p, int r) {
		name = "원";
		this.points = p;
		this.r = r;
	}

	public Circle(int x, int y, int r) {
		name = "원";
		this.points = new Point[] { new Point(x, y) };
		this.r = r;
	}

	public int getR() {
		return r;
	}

	public void setR(int r) {
		this.r = r;
	}

	@Override
	public void draw() {
		super.draw();
		System.out.println("원점:" + points[0] + "|반지름:" + r);
	}
}
