package p0409;

public class MethodExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x = f1(3);
		System.out.println("x:" + x);
		f2("희상");
		char y = f3(2);
		System.out.println("y:" + y);
	}
	//static을 붙이는 이유는 객체를 생성하지 않더라도 함수 호출이 가능하도록 구현하기 위해
	static int f1(int num) {
		int res;
		res = num * 3;
		return res;
	}
	
	static void f2(String name) {
		System.out.println(name + "님 반갑습니다.");
	}
	
	static char f3(int idx) {
		char[] arr = {'a', 'b', 'c'};
		if (idx < 0 || idx > arr.length) {
			return (char)-1;
		}
		return arr[idx];
	}
	

}
