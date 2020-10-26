package access.test;

import access.sample.Child;
import access.sample.Parent;

public class TestProtected {
	public static void main(String[] args) {
		Parent parent = new Parent();	// 객체생성
		Child child = new Child();		//객체생성 //클래스명 객체참조_변수명 = new 클래스_생성자명();
		
		parent.num = 10;	// protected 멤버는 다른 패키지에서의 클래스 밖에서는 접근 불가 !!!!!!!!!!!!
		// protected 멤버는 상속된 후손 내에서만 사용 가능함!!!!!!
		// 부모가 자식까지는 보호한다고 생각하면 된다
		
		child.insert();
		child.out();
	}
}


//
//JAVA에서는 객체를 New 연산자로 선언하고 생성한다.
//// 클래스명 객체참조_변수명 = new 클래스_생성자명();
//클래스명 자료형의 변수를 선언하는 것 
// ex)
//Complex k = new Complex();
//Complex 형의 변수 k를 선언하고
// 변수 k에 새롭게만든 Complex 객체를 대입!