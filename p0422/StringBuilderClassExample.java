package p0422;

import java.util.Scanner;

public class StringBuilderClassExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		
		for (int i = 0; i < 3; i++) {
			System.out.print("단어 입력 >> ");
			sb.append(sc.next());
		}
		
		System.out.println(sb);
		
		sb.delete(3, 5);
		System.out.println(sb);
		
		sb.insert(3, "xxx");
		System.out.println(sb);
		
		sb.replace(3, 5, "yyy");
		System.out.println(sb);

	}

}
