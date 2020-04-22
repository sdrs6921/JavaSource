package p0407;

import java.util.Scanner;

import p0414.Test7Main;

public class Homework {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		// 1. 별찍기
		// 크기 입력 받아서
		// *
		// **
		// ***
		// ****
		System.out.print("크기입력:");
		int size = sc.nextInt();
		
		for (int i = 1; i <= size; i++) {
			for (int j = 0; j < i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}

		// 2. 별찍기
		// 크기 입력 받아서
		//    *
		//   **
		//  ***
		// ****
		System.out.print("크기입력:");
		size = sc.nextInt();

		for (int i = 0; i < size; i++) {
			for (int j = 1; j <= size; j++) {
				if (j < (size-i))
					System.out.print(" ");
				else
					System.out.print("*");
			}
			System.out.println();
		}
		// 3. 별찍기
		// 크기 입력 받아서
		//    *
		//   ***
		//  *****
		// *******
		System.out.print("크기입력:");
		size = sc.nextInt();
		
		for (int i = size; i > 0; i--) {
			for (int j = 1; j <= (size*2) - i; j++) {
				if (j < i) {
					System.out.print(" ");
				}
				else {
					System.out.print("*");
				}
			}
			System.out.println();
		}

		// 4. 마름모 별찍기
		// 크기 입력 받아서
		//   *
		//  ***
		// *****
		//  ***
		//   *
		System.out.print("크기입력:");
		size = sc.nextInt();
		
		for (int i = 1; i < size * 2; i++) {
			for (int j = 1; j < size * 2; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		sc.close();
		Test7Main t1 = new Test7Main();
	}

}
