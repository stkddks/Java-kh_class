package trycatch;
import java.io.FileNotFoundException;
import java.io.FileReader;

class ExceptionTest{
	public void test() throws FileNotFoundException {	// ������ �߻��ϸ� �Ʒ��� ����ó���� �����ش�.
		new FileReader("test.txt");
	}
}

public class ExceptionDemo2 {
	
	public static void main(String[] args) {
		ExceptionTest e = new ExceptionTest();
		try {
			e.test();
		} catch (FileNotFoundException e1) {		// �ش� ������ �ִ��� ������ Ȯ���ϴ� ����ó��
			System.out.println("������ ã�� ���߽��ϴ�");
			e1.printStackTrace();	// ���⼭ ������ ������ ��´�
		}
		
	}
	
//
//	public static void main(String[] args) throws FileNotFoundException {
//		ExceptionTest e = new ExceptionTest();
//		e.test();
//		
//	}

}

