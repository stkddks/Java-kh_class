package inherit.sample;

public class Child extends Parent {
	public void out() {
		System.out.println("�ڽ� Ŭ���� �޼ҵ�");
	}
	
	@Override
	public void display() {
		System.out.println("��ӹ޾� �������� �޼ҵ�");
	}
}