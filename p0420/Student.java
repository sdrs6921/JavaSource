package p0420;

class Subject {
	private int subCode;
	private String subName;

	public Subject(int subCode, String subName) {
		this.subCode = subCode;
		this.subName = subName;
	}

	public int getSubCode() {
		return subCode;
	}

	public void setSubCode(int subCode) {
		this.subCode = subCode;
	}

	public String getSubName() {
		return subName;
	}

	public void setSubName(String subName) {
		this.subName = subName;
	}

	@Override
	public String toString() {
		return "Subject [subCode=" + subCode + ", subName=" + subName + "]";
	}

}

class Student extends Person {
	private Subject subject;

	public Student(PersonType pt, String num, String name, String dept, String tel, Subject subject) {
		this.type = pt;
		this.num = num;
		this.name = name;
		this.dept = dept;
		this.tel = tel;
		this.subject = subject;
	}

	public Subject getSubject() {
		return subject;
	}

	public void setSubject(Subject subject) {
		this.subject = subject;
	}

	@Override
	public String toString() {
		return "Student [subject=" + subject + ", type=" + type + ", num=" + num + ", name=" + name + ", dept=" + dept
				+ ", tel=" + tel + "]";
	}
}

class Prof extends Person {
	private Subject subject;

	public Prof(PersonType pt, String num, String name, String dept, String tel, Subject subject) {
		this.type = pt;
		this.num = num;
		this.name = name;
		this.dept = dept;
		this.tel = tel;
		this.subject = subject;
	}

	public Subject getSubject() {
		return subject;
	}

	public void setSubject(Subject subject) {
		this.subject = subject;
	}

	@Override
	public String toString() {
		return "Prof [subject=" + subject + ", type=" + type + ", num=" + num + ", name=" + name + ", dept=" + dept
				+ ", tel=" + tel + "]";
	}
	
	
}

class Staff extends Person {
	private String task;

	public Staff (PersonType pt, String num, String name, String dept, String tel, String task) {
		this.type = pt;
		this.num = num;
		this.name = name;
		this.dept = dept;
		this.tel = tel;
		this.task = task;
	}

	public String getTask() {
		return task;
	}

	public void setTask(String task) {
		this.task = task;
	}

	@Override
	public String toString() {
		return "Staff [task=" + task + ", type=" + type + ", num=" + num + ", name=" + name + ", dept=" + dept
				+ ", tel=" + tel + "]";
	}
	
	
}