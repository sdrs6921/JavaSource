package p0423;

import java.util.ArrayList;

class A {
	int x;

	public A(int x) {
		this.x = x;
	}
	@Override
	public String toString() {
		return "A [x=" + x + "]";
	}
	
	
}

public class ArrayListExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//���� : ũ��� Ÿ�Կ� ������ ����.
		ArrayList a1 = new ArrayList();
		a1.add("asdf");
		a1.add(12);
		a1.add(3.13f);
		a1.add(new A(1));
		
		for (int i = 0; i < a1.size(); i++) {
			System.out.println(a1.get(i));
		}
		
		ArrayList<String> a2 = new ArrayList<String>();
		
		a2.add("aaa");
		a2.add("bbb");
		a2.add(0, "ccc");
		a2.set(1, "zzz");
		
		for (String a : a2) {
			System.out.println(a);
		}
		
		if (a2.contains("aaa")) {
			System.out.println(a1.indexOf("aaa") + " ��ġ�� �ִ�.");
		} else {
			System.out.println("����.");
		}
		
		System.out.println("z����");
		a1.remove("zzz");	
		
		for (int i = 0; i < a2.size(); i++) {
			System.out.println(a2.get(i));
		}
		
		System.out.println("0���� ����");
		a2.remove(0);
		
		for (int i = 0; i < a2.size(); i++) {
			System.out.println(a2.get(i));
		}
		
		System.out.println("��ü ����");
		a2.clear();
		
		if (a2.isEmpty()) {
			System.out.println("����Ʈ �� �����");
		}
		
		//ArrayList�� ���� �߰� (1, 2, 3, 4 ,5) 1�� ��ü 20���� ���� �� ��ü���
		//x�� 3�� ��ü �˻� �� ��ġ ���
		//x�� 3�� ��ü ���� �� ��ü ���
		//0�� ��� ���� �� ��ü ��� ���
		//��ü ��� ���� �� ����� �� Ȯ��
		ArrayList<A> aclassArray = new ArrayList<A>();
		
		for (int i = 0; i < 5; i++) {
			aclassArray.add(new A(i + 1));
		}
		
		for (int i = 0; i < aclassArray.size(); i++) {
			System.out.print(aclassArray.get(i).x + " ");
		}
		
		System.out.println();
		
		aclassArray.get(1).x = 20;
		
		for (int i = 0; i < 5; i++) {
			System.out.print(aclassArray.get(i).x + " ");
		}
		
		System.out.println();
		System.out.println(aclassArray.indexOf(new A(3)) + "��ġ�� ����");
		
		aclassArray.remove(0);
		
		for (int i = 0; i < aclassArray.size(); i++) {
			System.out.print(aclassArray.get(i).x + " ");
		}
		
		System.out.println();

		aclassArray.clear();
		
		if (aclassArray.isEmpty()) {
			System.out.println("���� �����");
		} else {
			System.out.println("���� ���� �ʾ���");
		}
		
	}

}
