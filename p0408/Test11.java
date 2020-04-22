package p0408;

public class Test11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = {1, 2, 3, 4, 5};
		int[] b = new int [3];
		
		//±Ì¿∫∫πªÁ
		System.arraycopy(a, 1, b, 0, 3);
		
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}
		
		System.out.println();

		for (int i = 0; i < b.length; i++) {
			System.out.print(b[i] + " ");
		}

		System.out.println();

		b[0] = 1;
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}

		System.out.println();
		
		for (int i = 0; i < b.length; i++) {
			System.out.print(b[i] + " ");
		}
	}

}
