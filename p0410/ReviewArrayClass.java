package p0410;
class MyArray {
	int[] arr;
	
	void setArray(int[] a) {
		arr = a;
	}
	
	boolean checkArray() {
		if (arr == null) {
			System.out.println("배열을 먼저 생성하시오.");
			return false;
		}
		return true;
	}

	void insertSort() {
		for (int i = 1; i < arr.length; i++) {
			int j = i - 1;
			int tmp = arr[i];
			
			while (j >= 0 && arr[j] > tmp) { 
				arr[j+1] = arr[j];
				j--;
			}
			
			arr[i] = tmp;
		}
	}
	
	void selectSort() {
		for (int i = 0; i < arr.length; i++) {
			int min = arr[i];
			int minIndex = i;
			
			for (int j = i; j < arr.length; j++) {
				if (min > arr[j]) {
					min = arr[j];
					minIndex = j;
				}
			}
			
			int tmp = arr[i];
			arr[i] = arr[minIndex];
			arr[minIndex] = tmp;
		}
	}
	
	void printArray() {
		if (checkArray()) {
			return;
		}
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}
	
	void sequantialSearch (int target) {
		if (!checkArray()) {
			return;
		}
		boolean flag = false;
		int targetIndex = 0;
		
		for (int i = 0; i < arr.length; i++) {
			if (target == arr[i]) {
				targetIndex = i;
				flag = true;
				break;
			}
		}
		if (flag) {
			System.out.println(targetIndex + "번째  방에 있음");
		}
	}
	
	void binarySeaarch(int num) {
		if (!checkArray()) {
			return;
		}
		
		
	}
}

public class ReviewArrayClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
