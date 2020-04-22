package p0421;

public class SuperChild extends SuperParent {
	private int a = 20;

	public void print() {
		System.out.println("super childÀÇ print()");
		System.out.println("a=" + a + "\n");
		superCall();
	}

	private void superCall() {
		System.out.println("super.a=" + super.a);
		super.print();
	}
}
