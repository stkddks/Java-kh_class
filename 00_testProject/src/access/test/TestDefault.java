package access.test;
import access.sample.DefaultSample1;		// �ٸ� ��Ű���� ���� Ŭ������ import �ؾ� ��� ����
public class TestDefault {

	public static void main(String[] args) {
	
		DefaultSample1 dt1 =  new DefaultSample1();
		DefaultSample2 dt2 =  new DefaultSample2();
		
		dt1.num1 = 100;	// �ٸ� ��Ű���� Ŭ���������� ���� �Ұ���
		dt2.num2 = 100;	// ���� ��Ű���� Ŭ������ ���� ����	// DefaultSample2()�� ���� ��Ű���� ������ �Ǵ°�
	}

}
