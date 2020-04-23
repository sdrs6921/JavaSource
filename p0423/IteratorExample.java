package p0423;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> a1 = new ArrayList<String>();
		a1.add("aaa");
		a1.add("bbb");
		a1.add("ccc");
		a1.add("ddd");
		
		Iterator<String> it = a1.iterator();
		
		while (it.hasNext()) {
			System.out.println(it.next());
		}
		
		for (String s : a1) {
			System.out.println(s);
		}
	}

}
