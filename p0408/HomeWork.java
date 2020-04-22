package p0408;

public class HomeWork {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long[] fib = new long[100];
		
		for (int i = 0; i < 100; i++) {
			if (i < 2) {
				fib[i] = 1l;
			} else {
				fib[i] = fib[i-1] + fib[i-2];
			}
		}
		
		for (int i = 0; i < 100; i++) {
			if (i % 10 == 0) {
				System.out.println();
			}
			System.out.print(fib[i] + "\t");
		}
	}

}
