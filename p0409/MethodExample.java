package p0409;

public class MethodExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x = f1(3);
		System.out.println("x:" + x);
		f2("���");
		char y = f3(2);
		System.out.println("y:" + y);
	}
	//static�� ���̴� ������ ��ü�� �������� �ʴ��� �Լ� ȣ���� �����ϵ��� �����ϱ� ����
	static int f1(int num) {
		int res;
		res = num * 3;
		return res;
	}
	
	static void f2(String name) {
		System.out.println(name + "�� �ݰ����ϴ�.");
	}
	
	static char f3(int idx) {
		char[] arr = {'a', 'b', 'c'};
		if (idx < 0 || idx > arr.length) {
			return (char)-1;
		}
		return arr[idx];
	}
	

}
