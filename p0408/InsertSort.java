package p0408;

public class InsertSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 5, 8, 3, 6, 2, 9, 1, 7, 4 };

		System.out.println("정렬 전");

		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}

		System.out.println();
		
		//Insertion Sort
		for (int i = 1; i < arr.length; i++) {
			int j = i-1, tmp = arr[i];
			 
			while (j >= 0 && tmp < arr[j]) {
				arr[j+1] = arr[j];
				j--;
			}
			arr[j + 1] = tmp;
		}
		System.out.println("정렬 후");

		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}

}
