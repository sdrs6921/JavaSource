package p0422;

import java.util.Scanner;

import javax.swing.plaf.synth.SynthSplitPaneUI;

class Test5 {
	private int num;
	
	public void setNum (int num) throws Exception {
		this.num = num;
		//���� �߻� �ڵ� throws�� ���ܸ� ó���ϴ� ���̰�
		//throw�� ���ܸ� �߻���Ű�� ��
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
		System.out.println("���ڸ� �Է��Ͻÿ�! (1~5)"); 
		
		try {
			t.setNum(sc.nextInt());
		} catch (Exception e) {
			System.out.println("========== e ��� ============");
			System.out.println(e);
			System.out.println("=====e.getMessage() ��� =====");
			System.out.println(e.getMessage());
			System.out.println("=====e.printStack() ��� =====");
			e.printStackTrace();
	
		}
		
		System.out.println("end");
	}

}
