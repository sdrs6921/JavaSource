package p0422;

class Test4 {
	public void test1() {
		String str = null;
		char ch = str.charAt(0);
		System.out.print("Ã¹¹®ÀÚ:" + ch);
	}
	
	public void test2() {
		test1();
	}
	
	public void test3() {
		test2();
	}
}
public class Test4Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Test4 t = new Test4();
		try {
			t.test3();
		} catch (NullPointerException e) {
			System.out.println(e);
		}
		
		System.out.println("end");
	}

}
