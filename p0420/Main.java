package p0420;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Staff staff = new Staff(new PersonType(1, "����"), "1", "aaa", "����", "1111", "�λ����");
		System.out.println(staff.toString());
		Student student = new Student(new PersonType(2, "�л�"), "2", "bbb", "��ǻ���к�", "2222", new Subject(1, "�����а���"));
		System.out.println(student.toString());
		Prof prof = new Prof(new PersonType(3, "�л�"), "3", "ccc", "��ǻ���к�", "333", new Subject(2, "�ü��"));
		System.out.println(prof.toString());
	}

}
