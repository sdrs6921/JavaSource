package p0414;
class Test5 {
	String name;
	String tel;
	String address;
	
	Test5() {
		this("aaa", "111");
		System.out.println("Default");
	}
	
	Test5 (String name, String tel) {
		this(name, tel, "대한민국");
		System.out.println("2params!");
	}
	
	Test5(String name, String tel, String address) {
		this.name = name;
		this.tel = tel;
		this.address = address;
		System.out.println("3params!");
		System.out.println("name:" + name);
		System.out.println("tel" + tel);
		System.out.println("address" + address);
	}
}
public class Test5Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Test5 t1 = new Test5();
		System.out.println("=============");
		Test5 t2 = new Test5("bbb", "111");
		System.out.println("=============");
		Test5 t3 = new Test5("bbb", "11111", "서초구"); 
	}

}
