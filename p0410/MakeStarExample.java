package p0410;

import java.util.Scanner;

public class MakeStarExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int size = 0;
		Scanner sc = new Scanner(System.in);
		System.out.print("size:");
		size = sc.nextInt();
		int m = (size) / 2 + 1;
		
		for (int i = 0; i < m; i++) {
			char ch = ' ';
			for (int j = 0; j < m + i; j++) {
				if (j == m - i - 1) {
					ch = '*';
				}
				System.out.print(ch);
			}
			System.out.println();
		}
		sc.close();
	}

}
