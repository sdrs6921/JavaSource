package p0422;

import java.io.IOException;

class Test3 {
	public void test1() throws IOException {
		int ch;
		while ((ch = System.in.read()) != '\n') {
			System.out.print((char) ch);
		}
	}
}
public class Test3Main {

	//throws : 예외 처리를 미룸. 현재 try-catch로 예외처리를 해야 하나 하지 않고
	//이 메서드를 호출하는 쪽으로 예외처리를 미루겠다는 의미
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Test3 t = new Test3();
		try {
			t.test1();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
