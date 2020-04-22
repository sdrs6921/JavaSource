package p0422;

import java.util.Scanner;

import javax.swing.plaf.synth.SynthSplitPaneUI;

class Test5 {
	private int num;
	
	public void setNum (int num) throws Exception {
		this.num = num;
		//예외 발생 코드 throws는 예외를 처리하는 것이고
		//throw는 예외를 발생시키는 것
		if (num > 5) {
			throw new Exception("num excption");
		}
	}
}

public class Test5Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Test5 t = new Test5();
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자를 입력하시오! (1~5)"); 
		
		try {
			t.setNum(sc.nextInt());
		} catch (Exception e) {
			System.out.println("========== e 출력 ============");
			System.out.println(e);
			System.out.println("=====e.getMessage() 출력 =====");
			System.out.println(e.getMessage());
			System.out.println("=====e.printStack() 출력 =====");
			e.printStackTrace();
	
		}
		
		System.out.println("end");
	}

}
