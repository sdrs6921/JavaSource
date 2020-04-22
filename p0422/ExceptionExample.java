package p0422;
class A {
	int x = 10;
}
public class ExceptionExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("���� �߻� ��");
		try {
			int x = 3 / 0;
		} catch (ArithmeticException e) {
			System.out.println(e);
		}
		System.out.println("�̰� ��� �ȵ�");

		// ���� : ������ �� ���� �߻�.
		// ���� : ��Ÿ�� �ÿ� ������ �߻�
		// ���� �߻� -> �ڹ� ����ӽ��� ���� ��ü ���� �� ���α׷��� ���� --> ���α׷����� ���� ��ü�� ������ �⺻ ������
		// ���α׷� �ߴ�
		// ���� ó�� : ���ܸ� �¾Ƶ� ���α׷��� �ߴܵ��� �ʰ� �ϴ� ��
		
		A a = null;
		int[] b = {1, 2, 3};
		int res;
		
		try {
				/*
			 * try block���� ���ܰ� �߻��Ѵٸ� 
			 * try �� ������ �ٸ� ���� �ڵ�� ������� �ʴ´�!
			 * */
			System.out.println("1");
			System.out.println(a.x); //Nullpointer Exceptyion
			System.out.println("2");
			
			for (int i = 0; i <= b.length; i++) {
				System.out.print(b[i] + " ");//ArrayOutofBounds Exception
			}
			System.out.println("\n3");
			
			res = 3 / 0;
		} catch (NullPointerException e) {
			System.out.println(e);
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println(e);
		} catch (ArithmeticException e) {
			System.out.println(e);
		} catch (Exception e) {
			//else�� ������ �ϵ��� -> ���� ��� ���ܵ��� ó���ϰ� ���� ���ܵ��� ���� ó��  
			System.out.println(e);
		} finally {
			System.out.println("���ܰ� �߻��ϴ� ���ϴ� �ᱹ���� ����Ǵ� block");
		}
		
		System.out.println("5");
	}

}
