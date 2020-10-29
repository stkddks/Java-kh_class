package trycatch;
import java.io.FileNotFoundException;
import java.io.FileReader;

class ExceptionTest{
	public void test() throws FileNotFoundException {	// 에러가 발생하면 아래의 예외처리로 던져준다.
		new FileReader("test.txt");
	}
}

public class ExceptionDemo2 {
	
	public static void main(String[] args) {
		ExceptionTest e = new ExceptionTest();
		try {
			e.test();
		} catch (FileNotFoundException e1) {		// 해당 파일이 있는지 없는지 확인하는 예외처리
			System.out.println("파일을 찾지 못했습니다");
			e1.printStackTrace();	// 여기서 에러의 내용을 찍는다
		}
		
	}
	
//
//	public static void main(String[] args) throws FileNotFoundException {
//		ExceptionTest e = new ExceptionTest();
//		e.test();
//		
//	}

}

