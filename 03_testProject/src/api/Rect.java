
// int타입의 width(너비)와 height(높이) 필드를 가지는 Rect1클래스를 작성하고, 
// 면적이 같으면 두 Rect 객체가 잩은 것으로 판별하는 equals()를 작성하라. 
// 생성자에서 너비와 높이를 받아 width, height 필드를 초기화하라.

package api;

public class Rect {
	public static void main(String[] args) {
		Rect1 a = new Rect1(2,3);
		Rect1 b = new Rect1(3,2);
		Rect1 c = new Rect1(3,4);
		if (a.equals(b))		// true 냐 false 냐
			System.out.println("a is equal to b");
		if (a.equals(c))
			System.out.println("a is equal to c");
		if(b.equals(c))
			System.out.println("b is equal to c");
	}
}
	

class Rect1{
	private int width;
	private int height;
	
	public Rect1(int width, int height) {	// 생성자
		this.width = width;		//초기화
		this.height = height;	//초기화
	}
	
	public boolean equals(Object obj) {
		Rect1 p = (Rect1)obj;
		if(width*height ==p.width*p.height)
			return true;
		else 
			return false;
	}
}
