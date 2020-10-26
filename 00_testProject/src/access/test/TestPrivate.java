package access.test;
import access.sample.PrivateSample;	// 클래스 호출
public class TestPrivate {
	public static void main(String[] args) {
		PrivateSample psamp = new PrivateSample();	
		// PrivateSample()라는 클래스를 선언한다?호출한다?
		// 생성을 한다고 했는데 선언을 안해서 에러가 난다.
		// import로 참조해야할 클래스 위치 첨부
		// 생성한 것을 psamp라는 이름으로 갖다 쓴다는 의미
		
		psamp.num=10;	// private 이므로 접근 제한 발생
		psamp.setNum(10);	// public 이므로 접근 가능
		
		// class 안에서의 변수 호출은 무조건 get/set 을 써야한다.
		// 일반적으로 num=10 이 안된다는 소리야
		// set으로 불러와서 값을 세팅해줘야 해!!!
		
		System.out.println(psamp.getNum());		
		//getNum 이 public 이므로 접근 가능
	}
}


/*

JAVA에서는 객체를 New 연산자로 선언하고 생성한다.
Class타입 변수명 = new 생성자 ();
// 클래스명 객체참조_변수명 = new 클래스_생성자명();
// 
Class타입이 자료형이여
이 자리에는 자료형이 들어가면 되

ex)
String str2 = new String("abc"); // String 타입의 변수 str2에 새롭게(new) String 객체를 생성하여  연결!
 
ex)
 public static void main(String[] args) {
  // CLASS 타입의 reference 변수에, 새롭게 만든 CLASS 객체를 대입!
  CLASS reference = new CLASS();
}


*/