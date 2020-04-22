package p0410;
class Point {
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

public class PointMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Point[] p = new Point[2];
		
		for (int i = 0; i < p.length; i++) {
			p[i] = new Point();
			p[i].setXY(i + 1, i + 1);
		}
	}

}
