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
		//장점 : 크기와 타입에 제한이 없음.
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
			System.out.println(a1.indexOf("aaa") + " 위치에 있다.");
		} else {
			System.out.println("없다.");
		}
		
		System.out.println("z삭제");
		a1.remove("zzz");	
		
		for (int i = 0; i < a2.size(); i++) {
			System.out.println(a2.get(i));
		}
		
		System.out.println("0번방 삭제");
		a2.remove(0);
		
		for (int i = 0; i < a2.size(); i++) {
			System.out.println(a2.get(i));
		}
		
		System.out.println("전체 삭제");
		a2.clear();
		
		if (a2.isEmpty()) {
			System.out.println("리스트 다 비워짐");
		}
		
		//ArrayList에 다음 추가 (1, 2, 3, 4 ,5) 1번 객체 20으로 수정 후 전체출력
		//x가 3인 객체 검색 후 위치 출력
		//x가 3인 객체 삭제 후 전체 출력
		//0번 요소 삭제 후 전체 요소 출력
		//전체 요소 삭제 후 비었는 가 확인
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
		System.out.println(aclassArray.indexOf(new A(3)) + "위치에 있음");
		
		aclassArray.remove(0);
		
		for (int i = 0; i < aclassArray.size(); i++) {
			System.out.print(aclassArray.get(i).x + " ");
		}
		
		System.out.println();

		aclassArray.clear();
		
		if (aclassArray.isEmpty()) {
			System.out.println("방이 비었음");
		} else {
			System.out.println("방이 비지 않았음");
		}
		
	}

}
