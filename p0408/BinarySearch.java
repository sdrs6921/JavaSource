package p0408;

import java.util.Scanner;

public class BinarySearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {-1, 3, 7, 9, 52, 63, 97, 81, 100};
		int search = 0, start, end;
		Scanner sc = new Scanner(System.in);
		
		System.out.print("찾을 값:");
		search = sc.nextInt();
		start = 0;
		end = arr.length-1;
		int mid = (start + end) / 2;
		
		while (arr[mid] != search && start < end) {
			if (arr[mid] > search) {
				end = mid - 1;
			} else {
				start = mid + 1;
			}
			mid = (start + end) / 2;
		}
		
		if (start >= end) {
			System.out.println("값이 없습니다.");
		}
		else {
			System.out.println("index:" + mid);
		}
		
		sc.close();
	}

}
