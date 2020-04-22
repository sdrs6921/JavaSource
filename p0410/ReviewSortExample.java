package p0410;

public class ReviewSortExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 4, 9, 6, 2, 5, 7, 1, 3, 8 };

		System.out.print("Before Sorted:" + "\t");

		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}

		System.out.println();

		// Bubble Sort
		for (int i = 0; i < arr.length - 1; i++) {
			for (int j = 0; j < arr.length - 1 - i; j++) {
				if (arr[j] > arr[j + 1]) {
					int tmp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = tmp;
				}
			}
		}

		System.out.print("After Sorted:" + "\t");

		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}

		System.out.println();

		int[] arr2 = { 4, 9, 6, 2, 5, 7, 1, 3, 8 };

		System.out.print("Before Sorted:" + "\t");

		for (int i = 0; i < arr2.length; i++) {
			System.out.print(arr2[i] + " ");
		}

		System.out.println();

		// Insertion Sort
		for (int i = 1; i < arr2.length; i++) {
			int j = i - 1;
			int tmp = arr2[i];
			// while���� �� ������ ������ ���� �������
			// j�� �� �ձ��� �ͼ� -1�� �ȴٸ� arr2[-1] �迭�� Ž���ؾ� �ϴµ�
			// �̷� ��� ArrayOutOfIndex ��Ÿ�� ������ �߻��� �� ����
			while (j >= 0 && arr2[j] > tmp) {
				arr2[j + 1] = arr2[j];
				j--;
			}
			arr2[j + 1] = tmp;
		}

		System.out.print("After Sorted:" + "\t");

		for (int i = 0; i < arr2.length; i++) {
			System.out.print(arr2[i] + " ");
		}

		System.out.println();
		int[] arr3 = { 4, 9, 6, 2, 5, 7, 1, 3, 8 };

		System.out.print("Before Sorted:" + "\t");

		for (int i = 0; i < arr3.length; i++) {
			System.out.print(arr3[i] + " ");
		}

		System.out.println();

		
		// Selection Sort
		for (int i = 0; i < arr3.length; i++) {
			int min = arr3[i];
			int min_idx = i;
			
			for (int j = i + 1; j < arr3.length; j++) {
				if (min > arr3[j]) {
					min = arr3[j];
					min_idx = j;
				}
			}
			int tmp = arr3[i];
			arr3[i] = arr3[min_idx];
			arr3[min_idx] = tmp;
		}

		System.out.print("After Sorted:" + "\t");

		for (int i = 0; i < arr3.length; i++) {
			System.out.print(arr3[i] + " ");
		}
	}

}
