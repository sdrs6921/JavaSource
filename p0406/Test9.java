package p0406;
import java.util.Scanner;

public class Test9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		// for (int i = 1; i <= 100; i++) {
		// System.out.println(i);
		// }
		//
		//1~100 중에서 홀수만 출력
		// for (int i = 1; i <= 100; i++) {
		// if (i % 2 == 1) {
		// System.out.println(i);
		// }
		// }
		
		// //1~100까지의 합
		// int res = 0;
		//
		// for (int i = 1; i <= 100; i++) {
		// res += i;
		// }
		//
		// System.out.println(res);
		//
		// //해당 숫자의 약숙 출력하기
		// int num = 0;
		// System.out.print("약수를 구할 숫자 입력:");
		// num = sc.nextInt();
		//
		// for (int i = 1; i <=num; i++) {
		// if (num % i == 0) {
		// System.out.print(i + " ");
		// }
		// }
		// System.out.println();
		
		//99단 중 4단 출력
		for (int i = 1; i < 10; i++) {
			System.out.println("4*" + i + " = " + 4*i);
		}
		
		System.out.println("=========");
		
		int num = 0;
		String star = "*";
		
		System.out.print("별찍기 단계: ");
		num = sc.nextInt();
		for (int i = 0; i < num; i++) {
			System.out.println(star);
			star += "*";
		}
		sc.close();
	}
	
	

}
