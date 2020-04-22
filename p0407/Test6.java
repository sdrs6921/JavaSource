package p0407;

public class Test6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x = 3;
		
		switch(x) {
		case 1:
			System.out.println("x는 1");
			break;//switch문 탈출
		case 2:
			System.out.println("x는 2");
			break;
		case 3:
			System.out.println("x는 3");
			break;
		default:
			System.out.println("x는 이외의 값");
			break;
		}
	}

}
