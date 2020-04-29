package p0429.jdbc.addr;

import java.io.Serializable;

public class Member implements Serializable{
	private int num;
	private String name;
	private String tel;
	private String address;

	public Member() {

	}

	

	@Override
	public String toString() {
		return "Member [num=" + num + ", name=" + name + ", tel=" + tel + ", address=" + address + "]";
	}



	public Member(int num, String name, String tel, String address) {
		this.num = num;
		this.name = name;
		this.tel = tel;
		this.address = address;
	}

	public int getNum() {
		return num;
	}
	
	public void setNum(int num) {
		this.num = num;
	}
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getTel() {
		return tel;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		if (obj != null && obj instanceof Member) {
			Member obj2 = (Member)obj;
			if (this.name.equals(obj2.name)) {
				return true;
			}
		}
		return false;
	}

}
