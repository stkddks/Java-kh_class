package test.getClass;
import java.awt.Point;
import java.lang.reflect.Field;
public class GetClassEx {
	public void testGetClass() {
		Point point = new Point(10, 20);
		Class cls = point.getClass();
		System.out.println("getName() : " + cls.getName()); // ��ü�� Ŭ���� �̸�
		System.out.println("getSuperclass() : " + cls.getSuperclass()); // ����Ŭ���� �̸�
		Field[] fields = cls.getDeclaredFields();
		for (Field f : fields) {
			System.out.println("Field : " + f);
		}
	}
}