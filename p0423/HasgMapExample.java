package p0423;

import java.util.HashMap;
import java.util.Iterator;

public class HasgMapExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//키와 값을 쌍으로 저장 : <key type, Value Type> 선언 후 저장 키는 셋. 순서 없는 값들의 집합으로 중복 허용 X
		HashMap<String, String> map = new HashMap<String, String>();
		map.put("name", "aaa");
		map.put("tel", "111");
		map.put("addr", "서초구");
		
		System.out.println("name:"  + map.get("name"));
		System.out.println("tel:" + map.get("tel"));
		System.out.println("addr:" + map.get("addr"));
		
		map.remove("tel");
		
		System.out.println("name:"  + map.get("name"));
		System.out.println("tel:" + map.get("tel"));
		System.out.println("addr:" + map.get("addr"));
		
		map.put("tel", "111");
		
		Iterator<String> it = map.keySet().iterator();
		System.out.println("Key set");
		while (it.hasNext()) {
			System.out.println(it.next());
		}
		
		System.out.println("Valuess");
		it = map.values().iterator();
		
		while (it.hasNext()) {
			System.out.println(it.next());
		}
	}

}
