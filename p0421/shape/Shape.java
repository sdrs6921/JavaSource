package p0421.shape;

class Point {
	private int x;
	private int y;
	
	public Point() {
		
	}
	
	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	@Override
	public String toString() {
		return "Point (" + x + "," + y + ")";
	}
	
	
}

public class Shape {
	protected Point[] points;
	protected String name;
	
	public void draw() {
		System.out.println(name + "�� �׸���");
	}
}

//Circle, Triangle, Rectangle Shape�� ��ӹ޾Ƽ� �����.
//Main���� ���� 10���� �׸��ÿ�.
