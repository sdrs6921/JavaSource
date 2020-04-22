package p0420.PoketMon;

//���� Ŭ������ �������� �̾Ƽ� ����� �� ���� Ŭ������ ����
//������ �ڵ��� �ݺ��� ����
//������ ����� ������ �޼��� �����ϰ� ��ӹ޴� ���� Ŭ���������� ��Ŭ������ �����ϰ� �������ؼ� ���
//���� Ŭ������ ���̾ƿ��� ����


abstract public class PoketMon {
	protected String name;
	protected int hp;
	protected int exp;
	protected int level = 1;

	abstract public void eat();

	abstract public void sleep();

	abstract public boolean play();

	abstract public boolean exercise();

	abstract public void levelCheck();

	public void printInfo() {
		System.out.println(name + "��������");
		System.out.println("hp:" + hp);
		System.out.println("exp:" + exp);
		System.out.println("level:" + level);
	}
}
