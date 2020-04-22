package p0408;

public class Test5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1, 2, 3};
		int[] arr_cpy;
		
		//¾èÀº º¹»ç
		arr_cpy = arr;
		
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		
		System.out.println();
		
		for (int i = 0; i < arr_cpy.length; i++) {
			System.out.print(arr_cpy[i] + " ");
		}
		System.out.println();
		
		arr_cpy[0] = 200;
		
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		
		System.out.println();
		
		for (int i = 0; i < arr_cpy.length; i++) {
			System.out.print(arr_cpy[i] + " ");
		}
		System.out.println();
	}

}
