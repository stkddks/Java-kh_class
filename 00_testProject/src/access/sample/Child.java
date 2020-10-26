package access.sample;

public class Child extends Parent{		//Parent클래스를 상속받는다
	public void insert() {
		num=10;	
		// Pareent 클래스에서의 num변수 접근제한자는 protected 다
		// protected 멤버는 상속된 후손 내에서만 사용 가능함!!!!!!
		// 부모가 자식까지는 보호한다고 생각하면 된다
	}
	public void out() {
		System.out.println(num);
	}
}
