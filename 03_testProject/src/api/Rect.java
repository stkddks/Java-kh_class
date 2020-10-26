
// intŸ���� width(�ʺ�)�� height(����) �ʵ带 ������ Rect1Ŭ������ �ۼ��ϰ�, 
// ������ ������ �� Rect ��ü�� ���� ������ �Ǻ��ϴ� equals()�� �ۼ��϶�. 
// �����ڿ��� �ʺ�� ���̸� �޾� width, height �ʵ带 �ʱ�ȭ�϶�.

package api;

public class Rect {
	public static void main(String[] args) {
		Rect1 a = new Rect1(2,3);
		Rect1 b = new Rect1(3,2);
		Rect1 c = new Rect1(3,4);
		if (a.equals(b))		// true �� false ��
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
	
	public Rect1(int width, int height) {	// ������
		this.width = width;		//�ʱ�ȭ
		this.height = height;	//�ʱ�ȭ
	}
	
	public boolean equals(Object obj) {
		Rect1 p = (Rect1)obj;
		if(width*height ==p.width*p.height)
			return true;
		else 
			return false;
	}
}
