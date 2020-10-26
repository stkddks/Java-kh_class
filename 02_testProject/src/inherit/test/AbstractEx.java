package inherit.test;

import inherit.sample.Professor;
import inherit.sample.Student;

public class AbstractEx {
	public static void main(String[] args) {
		Student stu = new Student("È«±æµ¿", "ÀÚ¹Ù");
		Professor prof = new Professor("±èÃáÃß", "ÄÄÇ»ÅÍ°úÇĞ");
		stu.out ( );
		prof.out ( );
	}
}