
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
 위의 코드는 StudentPerson과 EmployeePerson가 사실상 같은 구조를 가지고 있다. 
 중복이 발생하고 있는 것이다. 중복을 제거해보자. (아래코드)
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
        Person p1 = new Person("부장");
        EmployeeInfo ei = (EmployeeInfo)p1.info;
        System.out.println(ei.rank);
    }
}
*/


/*
 위의 코드는 성공적으로 컴파일이 된다. 하지만 실행을 하면 오류가난다.런타임에러가 난다.
 클래스 Person의 생성자는 매개변수 info의 데이터 타입이 Object이다. 따라서 모든 객체가 될 수 있다. 
 그렇기 때문에 위와 EmployeeInfo의 객체가 아니라 String이 와도 컴파일 에러가 발생하지 않는다. 
 대신 런타임 에러가 발생한다. 
 
 컴파일 언어의 기본은 모든 에러는 컴파일이 발생할 수 있도록 유도해야 한다는 것이다. 
 런타임은 실제로 애플리케이션이 동작하고 있는 상황이기 때문에 런타임에 발생하는 에러는 항상 심각한 문제를 초래할 수 있기 때문이다. 

위와 같은 에러를 타입에 대해서 안전하지 않다고 한다. 
즉 모든 타입이 올 수 있기 때문에 타입을 엄격하게 제한 할 수 없게 되는 것이다. 

그래서 제네릭화를 해주는 것이다!!!
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
        System.out.println(ei1.rank); // 성공
         
        Person<String> p2 = new Person<String>("부장");
        String ei2 = p2.info;
        System.out.println(ei2.rank); // 컴파일 실패
    }
}

/*

p1은 잘 동작할 것이다. 중요한 것은 p2다. 
p2는 컴파일 오류가 발생하는데 p2.info가 String이고 String은 rank 필드가 없는데 이것을 호출하고 있기 때문이다. 
여기서 중요한 것은 아래와 같이 정리할 수 있다.

컴파일 단계에서 오류가 검출된다.
중복의 제거와 타입 안전성을 동시에 추구할 수 있게 되었다.

*/









