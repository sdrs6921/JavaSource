package p0423;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.InvalidPropertiesFormatException;
import java.util.Iterator;
import java.util.Properties;

public class ReadPropertyFileExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String path = "src/p0423/data.xml";
		FileInputStream fi = null;
		Properties prop = new Properties();
		
		try {
			fi = new FileInputStream(path);
			prop.loadFromXML(fi);
			fi.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InvalidPropertiesFormatException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		Iterator<Object> it = prop.keySet().iterator();
		
		while (it.hasNext()) {
			String key = (String) it.next();
			System.out.println(key + ":" + prop.getProperty(key));
		}
	}

}
