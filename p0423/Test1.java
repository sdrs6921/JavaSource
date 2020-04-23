package p0423;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class Test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//프로그램에서 자주 사용하는 설정값 등을 파이로 저장하거나 파일에서 읽어오는 동작 구현에 사용
		Properties prop = new Properties();
		prop.put("server ip", "210.23.34.45");
		prop.put("port", "8080");
		prop.put("id", "scott");
		prop.put("pwd", "tiger");
		
		try {
			FileOutputStream os = new FileOutputStream("src/p0423/data.xml");
			prop.storeToXML(os, "Properties test");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}

