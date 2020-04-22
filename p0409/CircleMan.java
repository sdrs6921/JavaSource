package p0409;

class Point {
	//��ǥ 1��
	int x;
	int y;

	void setXY(int a, int b) {
		x = a;
		y = b;
	}

	void printXY() {
		System.out.print("(" + x + "," + y + ")");
	}
	
}

class Circle {
	//Class�� ���� : �پ��� ������ Ÿ���� �ϳ��� Ÿ������ �����ϱ� ����
	Point p = new Point();
	int r;
	
	void setCircle(int x, int y, int z) {
		p.setXY(x, y);
		r = z;
	}
	
	void draw() {
		System.out.print("�߽���:");
		p.printXY();
		System.out.println("�� ������:" + r + "�� �� �׸�");
	}
}

public abstract class CircleMan {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Circle c = new Circle();
		c.setCircle(100, 200, 50);
		c.draw();
	}

}
