
/*
package org.opentutorials.javatutorials.generic;

class StudentInfo{
	public int grade;
	StudentInfo(int grade){ this.grade = grade; }
}
class StudentPerson{
	public StudentInfo info;
	StudentPerson(StudentInfo info){ this.info = info; }
}
class EmployeeInfo{
	public int rank;
	EmployeeInfo(int rank){ this.rank = rank; }
}
class EmployeePerson{
	public EmployeeInfo info;
	EmployeePerson(EmployeeInfo info){ this.info = info; }
}
public class GenericDemo {
	public static void main(String[] args) {
		StudentInfo si = new StudentInfo(2);
		StudentPerson sp = new StudentPerson(si);
		System.out.println(sp.info.grade); // 2
		EmployeeInfo ei = new EmployeeInfo(1);
		EmployeePerson ep = new EmployeePerson(ei);
		System.out.println(ep.info.rank); // 1
	}
}
*/


/*
 ���� �ڵ�� StudentPerson�� EmployeePerson�� ��ǻ� ���� ������ ������ �ִ�. 
 �ߺ��� �߻��ϰ� �ִ� ���̴�. �ߺ��� �����غ���. (�Ʒ��ڵ�)
*/


/*
package org.opentutorials.javatutorials.generic;
class StudentInfo{
    public int grade;
    StudentInfo(int grade){ this.grade = grade; }
}
class EmployeeInfo{
    public int rank;
    EmployeeInfo(int rank){ this.rank = rank; }
}
class Person{
    public Object info;
    Person(Object info){ this.info = info; }
}
public class GenericDemo {
    public static void main(String[] args) {
        Person p1 = new Person("����");
        EmployeeInfo ei = (EmployeeInfo)p1.info;
        System.out.println(ei.rank);
    }
}
*/


/*
 ���� �ڵ�� ���������� �������� �ȴ�. ������ ������ �ϸ� ����������.��Ÿ�ӿ����� ����.
 Ŭ���� Person�� �����ڴ� �Ű����� info�� ������ Ÿ���� Object�̴�. ���� ��� ��ü�� �� �� �ִ�. 
 �׷��� ������ ���� EmployeeInfo�� ��ü�� �ƴ϶� String�� �͵� ������ ������ �߻����� �ʴ´�. 
 ��� ��Ÿ�� ������ �߻��Ѵ�. 
 
 ������ ����� �⺻�� ��� ������ �������� �߻��� �� �ֵ��� �����ؾ� �Ѵٴ� ���̴�. 
 ��Ÿ���� ������ ���ø����̼��� �����ϰ� �ִ� ��Ȳ�̱� ������ ��Ÿ�ӿ� �߻��ϴ� ������ �׻� �ɰ��� ������ �ʷ��� �� �ֱ� �����̴�. 

���� ���� ������ Ÿ�Կ� ���ؼ� �������� �ʴٰ� �Ѵ�. 
�� ��� Ÿ���� �� �� �ֱ� ������ Ÿ���� �����ϰ� ���� �� �� ���� �Ǵ� ���̴�. 

�׷��� ���׸�ȭ�� ���ִ� ���̴�!!!
 */


package org.opentutorials.javatutorials.generic;
class StudentInfo{
    public int grade;
    StudentInfo(int grade){ this.grade = grade; }
}
class EmployeeInfo{
    public int rank;
    EmployeeInfo(int rank){ this.rank = rank; }
}
class Person<T>{
    public T info;
    Person(T info){ this.info = info; }
}
public class GenericDemo {
    public static void main(String[] args) {
        Person<EmployeeInfo> p1 = new Person<EmployeeInfo>(new EmployeeInfo(1));
        EmployeeInfo ei1 = p1.info;
        System.out.println(ei1.rank); // ����
         
        Person<String> p2 = new Person<String>("����");
        String ei2 = p2.info;
        System.out.println(ei2.rank); // ������ ����
    }
}

/*

p1�� �� ������ ���̴�. �߿��� ���� p2��. 
p2�� ������ ������ �߻��ϴµ� p2.info�� String�̰� String�� rank �ʵ尡 ���µ� �̰��� ȣ���ϰ� �ֱ� �����̴�. 
���⼭ �߿��� ���� �Ʒ��� ���� ������ �� �ִ�.

������ �ܰ迡�� ������ ����ȴ�.
�ߺ��� ���ſ� Ÿ�� �������� ���ÿ� �߱��� �� �ְ� �Ǿ���.

*/









