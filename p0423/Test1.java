package p0423;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class Test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//���α׷����� ���� ����ϴ� ������ ���� ���̷� �����ϰų� ���Ͽ��� �о���� ���� ������ ���
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

