package p0408;

import java.util.Scanner;

public class Test3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = new int[5];
		int sum = 0;
		float avg = 0;
		Scanner sc = new Scanner(System.in);
		
		for (int i = 0; i < arr.length; i++) {
			System.out.print("num:");
			arr[i] = sc.nextInt();
			sum += arr[i];
		}
		
		avg = (float) sum / arr.length;
		
		//배열 요소의 합과 평균
		System.out.println("sum:" + sum);
		System.out.println("average:" + avg);
		
		
		//배열 요소 중에서 큰 값과 작은 값
		int max = arr[0], min = arr[0];
		
		for (int i = 1; i < arr.length; i++) {
			if (max < arr[i]) {
				max = arr[i];
			}
			if (min > arr[i]) {
				min = arr[i];
			}
		}
		
		System.out.println("min:" + min);
		System.out.println("max:" + max);
		
		
		//순차 탐색
		int search;
		boolean flag = false;
		
		System.out.print("찾으려는 값 입력:");
		search = sc.nextInt();
		
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == search) {
				flag = true;
			}
		}
		
		if (flag) {
			System.out.println(search + "이 존재");
		} else {
			System.out.println(search + "이 존재하지 않음");
		}
		
		sc.close();
	}

}
