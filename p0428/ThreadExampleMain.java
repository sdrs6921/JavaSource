package p0428;
class Test1 extends Thread {

	@Override
	public void run() {
		// TODO Auto-generated method stub
		//Thread�� ��� ������ run()�� �������� ������ ����!
		//�����尡 ���۵Ǹ� �� �޼��尡 �����
		//�� �޼��忡 �� �̻� ����� ���� ������ �ڵ����� ������ ����
		for (int i = 1; i <= 27; i++) {
			System.out.print(i + "\t");
		}
	}
}

public class ThreadExampleMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Test1 t = new Test1();
		t.start();
		
		for (char i = 'a'; i <= 'z'; i++) {
			System.out.print(i + "\t");
		}
	}

}
