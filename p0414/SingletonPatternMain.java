package p0414;

import java.util.Calendar;
import java.util.Date;

class Singleton {
	private String str;
	private static Singleton t = new Singleton();
	
	private Singleton() {
		str = "Singleton Pattern";
	}
	
	public static Singleton getInstance() {
		return t;
	}
	
	public String getStr() {
		return str;
	}
}

public class SingletonPatternMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calendar c = Calendar.getInstance();
		Date d = c.getTime();
		System.out.println((d.getMonth() + 1) + "월 " + d.getDay() + "일 " 
									+ d.getHours() + "시 " + d.getMinutes() + "분");
	}

}
