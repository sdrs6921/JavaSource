package p0420;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Staff staff = new Staff(new PersonType(1, "직원"), "1", "aaa", "직원", "1111", "인사관리");
		System.out.println(staff.toString());
		Student student = new Student(new PersonType(2, "학생"), "2", "bbb", "컴퓨터학부", "2222", new Subject(1, "전삭학개론"));
		System.out.println(student.toString());
		Prof prof = new Prof(new PersonType(3, "학생"), "3", "ccc", "컴퓨터학부", "333", new Subject(2, "운영체제"));
		System.out.println(prof.toString());
	}

}
