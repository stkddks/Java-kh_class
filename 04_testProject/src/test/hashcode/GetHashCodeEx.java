package test.hashcode;

public class GetHashCodeEx {
	public void testHashCode() {
		Point point = new Point(10, 20);
		System.out.println(point.hashCode());
	}
}

class Point { // Point ��ü�� �����Ͽ� hashCode ������
	int posX;
	int posY;
	public Point(int posX, int posY) {
		this.posX = posX;
		this.posY = posY;
	}
	
	@Override
	public int hashCode() { // hashCode �޼ҵ� ������
		return super.hashCode();
	}
}