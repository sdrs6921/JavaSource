package p0407;

public class Test7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char ch = 'b';
		
		switch (ch) {
		case 'a':
			System.out.println("1번 문자");
			break;
		case 'b':
			System.out.println("2번 문자");
			break;
		case 'c':
			System.out.println("3번 문자");
			break;
		default:
			System.out.println("이외의 문자");
			break;
		}
		
		String str = "ccc";
		
		switch (str) {
		case "aaa":
			System.out.println("1번 문자");
			break;
		case "bbb":
			System.out.println("2번 문자");
			break;
		case "ccc":
			System.out.println("3번 문자");
			break;
		default:
			System.out.println("이외의 문자");
			break;
		}
		
	}

}
