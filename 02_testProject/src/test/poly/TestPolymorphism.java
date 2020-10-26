package test.poly;

import inherit.sample.Parent;
import poly.sample.Child;

public class TestPolymorphism {
	public static void main(String[] args) {
		
		Child c = new Child();
		System.out.println(c.x);
		c.display();
		c.out();
		System.out.println();
		
		Parent p = new Child(); 	// 생성자가 child임에 주의
		p.display(); //Overriding 된 parent 멤버이므로 접근 가능. 
		//child에서 오버라이딩 했으니까 child의 display가 출력된다.
		
		//p.out(); 	//컴파일에러. Parent 타입으로 Child 멤버에 접근할 수 없음.
	}
}
