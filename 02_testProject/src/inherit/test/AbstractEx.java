package inherit.test;

import inherit.sample.Professor;
import inherit.sample.Student;

public class AbstractEx {
	public static void main(String[] args) {
		Student stu = new Student("ȫ�浿", "�ڹ�");
		Professor prof = new Professor("������", "��ǻ�Ͱ���");
		stu.out ( );
		prof.out ( );
	}
}