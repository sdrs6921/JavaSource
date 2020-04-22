package p0420;
interface Max {
	int max(int[] array);
}

interface Sort {
	int[] sort(int[] array);
}

class MyArray implements Max, Sort {

	@Override
	public int[] sort(int[] array) {
		// TODO Auto-generated method stub
		int[] arr = new int [array.length];
		System.arraycopy(array, 0, arr, 0, array.length);
		
		for (int i = 0; i < arr.length; i++) {
			int min = i;
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[min] > arr[j]) {
					min = j;
				}
			}
			if (min != i) {
				int tmp = arr[i];
				arr[i] = arr[min];
				arr[min] = arr[i];
			}
		}
		return arr;
	}

	@Override
	public int max(int[] array) {
		// TODO Auto-generated method stub
		int max = 0;
		
		for (int i = 0; i < array.length; i++) {
			if (i == 0) {
				max = array[i];
			}
			else {
				if (max < array[i]) {
					max = array[i];
				}
			}
		}
		return max;
	}
	
}
public class MultiInheretenceExampleMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] t = {3, 7, 5, 9, 1, 4, 6, 2};
		MyArray ma = new MyArray();
		int max = ma.max(t);
		System.out.println("max: " + max);
		int[] sorted = ma.sort(t);
		System.out.print("Sorted ");
		for (int i = 0; i < sorted.length; i++) {
			System.out.print(sorted[i] + " ");
		}
		System.out.println();
	}

}
