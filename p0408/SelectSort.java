package p0408;

public class SelectSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 5, 8, 3, 6, 2, 9, 1, 7, 4 };

		System.out.println("정렬 전");

		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}

		System.out.println();
		
		for (int i = 0; i < arr.length; i++) {
			int min = arr[i], min_idx = i;
			for (int j = i; j < arr.length; j++) {
				if (min > arr[j]) {
					min = arr[j];
					min_idx = j;
				}
			}
			
			if (min != arr[i]) {
				int tmp = arr[i];
				arr[i] = min;
				arr[min_idx] = tmp;
			}
		}
		
		System.out.println("정렬 후");

		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}

}
