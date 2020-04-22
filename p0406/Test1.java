package p0406;

//c++과의 차이점 : 모든 코드는 클래스 안에 있어야 함. 자바 소스의 확장자는 ~.java로 되어 있음
/*여러 줄 주석*/
public class Test1 {

	// main함수. 프로그램의 시작과 끝.
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 4, b;

		a++;// a = a+1;
		System.out.println(a);
		a--;// a = a-1;
		System.out.println(a);

		a = 10;

		b = a++;
		System.out.println("a=" + a);
		System.out.println("b=" + b);

		a = 10;

		b = ++a;
		System.out.println("a=" + a);
		System.out.println("b=" + b);
		// int a = 10

		// String str = (a > 10) ? "a는 10보다 크다" : "a는 10보다 크지 않다";
		// System.out.println(str);
		//
		// str = ((a % 2) == 1) ? "a는 홀수" : "a는짝수";
		// System.out.println(str);

		// int a = 10, b = 20, c;
		//
		// c = a+b;
		//
		// System.out.println("a=" + a);
		// System.out.println("b=" + b);
		// System.out.println("aaa" + "bbb");
		//
		// System.out.println(a+"+"+b+"="+c);
		// System.out.println(a+"+"+b+"="+(a+b));
		//
		/*
		 * hello java 출력 System.out.println("hello java");
		 */
	}

}
