package p0421;

//���� �߻�Ŭ����(���, �߻�޼���) interface Ű���� ���., ��ü ���� �Ұ�
//���� ��� ����
//�������̽��� Ȱ��. ���� ����� �ʿ��� ��� �� ������Ʈ ����
public interface MyInter {
	int max = 100;

	void test1();

	void test2();
}

class MyInterImpl implements MyInter {

	@Override
	public void test1() {
		// TODO Auto-generated method stub
		System.out.println("test1" + max);
	}

	@Override
	public void test2() {
		// TODO Auto-generated method stub
		System.out.println("test2");
	}
	
}
