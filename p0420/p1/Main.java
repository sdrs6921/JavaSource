package p0420.p1;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Parent p = new Parent("parent", 41);
		p.printPerson();
		System.out.println("===============");
		Child c = new Child("child", 7, "���");
		c.printPerson();
		
		//������ �� �޼����� ���� ���� : ������ �� ����. Ÿ���� ����
		//�ڽ� ��ü������ ������ �� �޽��尡 ����. �θ� ���� ȣ���ϰ� ������ super
		//super:�θ� ��ü. super():�θ� ��ü ������ ȣ��
		
		
		//��ĳ����. ��ü Ÿ�Ը� ����. ��Ӱ��賢�� ĳ����. �θ� �༼ �� Ŭ������ ������ ����� ��� ����
		Parent cp = new Child("Upcasting", 11, "up");
		cp.printPerson();//UPĳ���� �����ǵ� �޼����� ���� ����
	}

}
