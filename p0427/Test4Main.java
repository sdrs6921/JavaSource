package p0427;

import java.io.IOException;
import java.io.InputStreamReader;

public class Test4Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int ch;
		InputStreamReader ir = new InputStreamReader(System.in);
		
		try {
			System.out.println("한글을 입력하시오");
			while ((ch = ir.read()) != '\n')  {
				System.out.print((char) ch);
			}
			ir.close();
			System.out.println();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
