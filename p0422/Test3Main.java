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

	//throws : ���� ó���� �̷�. ���� try-catch�� ����ó���� �ؾ� �ϳ� ���� �ʰ�
	//�� �޼��带 ȣ���ϴ� ������ ����ó���� �̷�ڴٴ� �ǹ�
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
