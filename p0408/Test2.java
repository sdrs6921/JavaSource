package p0408;

public class Test2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float[] arr = new float[2];
		float[] arr2 = {2.34f, 5.67f};
		
		arr[0] = 34.56f;
		arr[1] = 23.34f;
		
		int i;
		
		for (i = 0; i < arr.length; i++) {
			System.out.println("arr[" + i + "]=" + arr[i]);
		}
		
		for (i = 0; i < arr.length; i++) {
			System.out.println("arr2[" + i + "]=" + arr2[i]);
		}
	}

}
