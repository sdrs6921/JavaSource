package p0410;

public class FibonacciExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long num1 = 1, num2 = 1, num3;

		for (int i = 0; i < 80; i++) {
			if (i <= 1) {
				System.out.print("1\t");
			} else {
				num3 = num1 + num2;
				System.out.print(num3 + "\t");
				num1 = num2;
				num2 = num3;
			}

			if (i % 10 == 9) {
				System.out.println();
			}
		}

		System.out.println("=========================================================================");

		long[] fib = new long[80];

		for (int i = 0; i < fib.length; i++) {
			if (i < 2) {
				fib[i] = 1;
			} else {
				fib[i] = fib[i - 1] + fib[i - 2];
			}
		}

	}

}
