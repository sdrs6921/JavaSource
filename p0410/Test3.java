package p0410;

class MyArr {
	int[] arr;

	void setArr(int[] a) {
		arr = a;
	}

	boolean checkArr() {
		if (arr == null) {
			System.out.println("�迭�� ���� �����Ͻÿ�");
			return false;
		}
		return true;
	}

	void printArr() {
		int i;
		if (!checkArr()) {
			return;
		}
		for (i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + "\t");
		}
		System.out.println();
	}

	void insertSort() {
		int i, j, tmp;
		if (!checkArr()) {
			return;
		}
		for (i = 1; i < arr.length; i++) {
			tmp = arr[i];
			j = i - 1;
			while (j >= 0 && arr[j] > tmp) {
				arr[j + 1] = arr[j];// j��ġ�� ���� �� ĭ �ڷ� �̵�
				j--;
			}
			j++;
			arr[j] = tmp;
		}
	}

	void selectSort() {
		int i, j, tmp, min;
		if (!checkArr()) {
			return;
		}
		for (i = 0; i < arr.length - 1; i++) {
			min = i;
			for (j = i + 1; j < arr.length; j++) {
				if (arr[min] > arr[j]) {
					min = j;
				}
			} // �񱳰� �� ���� ���� ���� ��ġ�� min�� ����Ų��.
			if (min != i) {
				tmp = arr[min];
				arr[min] = arr[i];
				arr[i] = tmp;
			}
		}
	}

	void seqSearch(int num) {
		if (!checkArr()) {
			return;
		}
		int i;
		for (i = 0; i < arr.length; i++) {
			if (num == arr[i]) {
				System.out.println(i + "��° �濡 ����");
				break;
			}
		}
		if (i == arr.length) {
			System.out.println("����");
		}
	}

	void binarySearch(int num) {
		if (!checkArr()) {
			return;
		}
		selectSort();
		int f = 0, l = arr.length - 1, m;
		while (f <= l) {
			m = (f + l) / 2;
			if (arr[m] > num) {
				l = m - 1;
			} else if (arr[m] < num) {
				f = m + 1;
			} else {
				System.out.println(m + "��° �濡 ����");
				break;
			}
		}
		if (f > l) {
			System.out.println("����");
		}
	}
}

public class Test3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyArr ma = new MyArr();
		int[] a = {8,3,7,4,6,1,5,2};
		ma.setArr(a);
		ma.seqSearch(1);
		ma.seqSearch(13);
		ma.binarySearch(6);
		ma.binarySearch(34);
		ma.printArr();
	}

}
