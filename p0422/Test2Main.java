package p0422;

public class Test2Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a = "aaa";
		String b = new String("bbb");
		char[] c = { 'a', 'b', 'c' };
		String d = new String(c);

		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);

		String a1 = "aaa";
		String b1 = "aaa";
		String c1 = new String("aaa");

		System.out.println("a1 == b1: " + (a1 == b1));
		System.out.println("a1 == c1: " + (a1 == c1));
		System.out.println("a1.equals(b1): " + a1.equals(b1));
		System.out.println("a1.equals(c1): " + a1.equals(c1));
	}

}
