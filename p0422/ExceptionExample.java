package p0422;
class A {
	int x = 10;
}
public class ExceptionExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("문제 발생 전");
		try {
			int x = 3 / 0;
		} catch (ArithmeticException e) {
			System.out.println(e);
		}
		System.out.println("이건 출력 안됨");

		// 에러 : 컴파일 시 문제 발생.
		// 예외 : 런타임 시에 문제가 발생
		// 예외 발생 -> 자바 가상머신이 예외 객체 생성 및 프로그램에 던짐 --> 프로그래밍이 예외 객체를 맞으면 기본 동작은
		// 프로그램 중단
		// 예외 처리 : 예외를 맞아도 프로그램이 중단되지 않게 하는 것
		
		A a = null;
		int[] b = {1, 2, 3};
		int res;
		
		try {
				/*
			 * try block에서 예외가 발생한다면 
			 * try 블럭 내부의 다른 실행 코드는 실행되지 않는다!
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
			//else의 역할을 하도록 -> 위의 모든 예외들을 처리하고 남은 예외들을 몰아 처리  
			System.out.println(e);
		} finally {
			System.out.println("예외가 발생하던 안하던 결국에는 실행되는 block");
		}
		
		System.out.println("5");
	}

}
