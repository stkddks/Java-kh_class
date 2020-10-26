package testProject;

public class ObjectClass {
	public static void main(String[] args) {
		
		class Student{		// 구조체. 사용자 정의
			int age;
			int score;
			String name;
		}		
		
		public class StudentTest {
			public static void main(String[] args) {
				Student s = new Student(); //우리가 만든 데이터 타입
				s.age = 20;
				s.score = 100;
				s.name = "성연";
				System.out.println(s.age + " / "+ s.score + " / " + s.name);
			}
		}
		 
		CLASS reference = new CLASS();	// CLASS 타입의 reference 변수에, 새롭게 만든 CLASS 객체를 대입!
		    
	}

}




/*
 * 
JAVA에서는 객체를 New 연산자로 선언하고 생성한다.
//Class타입 변수명 = new 생성자 ();
//Class라는 자료형의 타입 (int형, String형 과 같은 자료형!)
// 자료형의 이름은 해당클래스의 이름과 같다.
// 해당 클래스자료형의 변수를 생성해주는 것! == 객체 생성이 된다.
//// 즉! 클래스명 객체참조_변수명 = new 클래스_생성자명();


ex)
String str2 = new String("abc"); // String타입(자료형)의 변수 str2에 새롭게(new) String 객체를 생성하여  연결!
 * 
 * 
 ex)
 public static void main(String[] args) {
  // CLASS 타입의 reference 변수에, 새롭게 만든 CLASS 객체를 대입!
  CLASS reference = new CLASS();
}
 * 
 * 
 ex) 
 //구조체 : 다른 타입의 변수들의 묶음 자료형
//사용자 정의 자료형
class Student{
    int age;
    int score;
    String name;
}

public class Stuent_Test {
    public static void main(String[] args) {
        Student s = new Student(); //우리가 만든 데이터 타입
        s.age = 20;
        s.score = 100;
        s.name = "성연";
        System.out.println(s.age + " / "+ s.score + " / " + s.name);
    }
}

 * 
 * 
 * 
 */