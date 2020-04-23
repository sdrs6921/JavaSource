package p0423.address;

public class Member {
	private String name;
	private String tel;
	private String address;

	public Member() {

	}

	@Override
	public String toString() {
		return "Member [name=" + name + ", tel=" + tel + ", address=" + address + "]";
	}

	public Member(String name, String tel, String address) {
		super();
		this.name = name;
		this.tel = tel;
		this.address = address;
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
