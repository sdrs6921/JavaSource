package p0427;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Test5 implements Serializable {
	private String name;
	private int age;

	public Test5() {

	}

	public Test5(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "Test5 [name=" + name + ", age=" + age + "]";
	}

}

public class Test5Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Object Stream은 바이트 단위 스트림이므로 1차 스트림도 바이트 스트림 이어야 함
		Test5 t1 = new Test5("aaa", 12);
		Test5 t2;
		
		try {
			FileOutputStream fo = new FileOutputStream("src/p0427/files/d.dat");
			ObjectOutputStream oo = new ObjectOutputStream(fo);
			FileInputStream fi = new FileInputStream("src/p0427/files/d.dat");
			ObjectInputStream oi = new ObjectInputStream(fi);
			
			oo.writeObject(t1);
			oo.close();
			fo.close();
			
			t2 = (Test5) oi.readObject();
			oi.close();
			fi.close();
			
			System.out.println(t2);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}

}
