package p0407;

public class Test9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//구구단 2~9단 세로로 출력
		for (int i = 1; i <= 9; i++) {
			for (int j = 2; j <= 9; j++) {
				System.out.print(j+"*"+i+"="+(j*i)+"\t");
			}
			System.out.println();
		}
		
		System.out.println("\n\n========================"
				+ "============================================\n\n");
		//구구단 2~9단 가로로 출력
		for (int i = 2; i <= 9; i++) {
			for (int j = 1; j <= 9; j++) {
				System.out.print(i+"*"+j+"="+(i*j) + "\t");
			}
			System.out.println();
		}
		
		System.out.println("\n\n========================"
				+ "============================================\n\n");
		
		System.out.print("100 이하의 수 중에서 소수의 개수 : ");
		for (int i = 2; i <= 100; i++) {
			boolean flag = true;
			for (int j = 2; j <= (i/2); j++) {
				if (i % j == 0) {
					flag = false;
				}
			}
			
			if (flag == true) {
				System.out.print(i + " ");
			}
		}
		
		System.out.println();
		
		int cnt = 0;
		System.out.print("100 이하의 수 중에서 소수의 개수 : ");
		for (int i = 2; i <= 100; i++) {
			cnt = 0;
			for (int j = 2; j < i - 1; j++) {
				if (i % j == 0) {
					cnt++;
				}
			}
			
			if (cnt == 0) {
				System.out.print(i + " ");
			}
		}
	}

}
