package p0420;
class PersonType {
	private int typeNum;
	private String typeName;
	
	public PersonType(int typeNum, String typeName) {
		this.typeNum = typeNum;
		this.typeName = typeName;
	}

	public int getTypeNum() {
		return typeNum;
	}

	public void setTypeNum(int typeNum) {
		this.typeNum = typeNum;
	}

	public String getTypeName() {
		return typeName;
	}

	public void setTypeName(String typeName) {
		this.typeName = typeName;
	}

	@Override
	public String toString() {
		return "PersonType [typeNum=" + typeNum + ", typeName=" + typeName + "]";
	}
	
}
public class Person {
	protected PersonType type;
	protected String num;
	protected String name;
	protected String dept;
	protected String tel;
	
	public PersonType getType() {
		return type;
	}
	public void setType(PersonType type) {
		this.type = type;
	}
	public String getNum() {
		return num;
	}
	public void setNum(String num) {
		this.num = num;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	public String getTel() {
		return tel;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}
	
	
}