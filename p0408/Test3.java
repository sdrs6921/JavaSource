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
		
		//�迭 ����� �հ� ���
		System.out.println("sum:" + sum);
		System.out.println("average:" + avg);
		
		
		//�迭 ��� �߿��� ū ���� ���� ��
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
		
		
		//���� Ž��
		int search;
		boolean flag = false;
		
		System.out.print("ã������ �� �Է�:");
		search = sc.nextInt();
		
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == search) {
				flag = true;
			}
		}
		
		if (flag) {
			System.out.println(search + "�� ����");
		} else {
			System.out.println(search + "�� �������� ����");
		}
		
		sc.close();
	}

}
