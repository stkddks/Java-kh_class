

// 예외처리의 각 에러마다의 에시들이다
// RuntimeException의 후소클래스들의 발생 예시



package trycatch;

class Ex{
	
}
public class ExTest extends Ex{

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int data1 = 10;
		int data2 = 0;
		int result;
		
		ExTest t = null;		// 현재 레퍼런스에는 null이 들어있음
		result =  data1/data2;		//ArithmeticException 발생 - 왜? data2가 0이니까
		t.hashCode();			// NullPointexception 발생 - 왜? null일때 해쉬코드 값 가져오려하면 이 에러난다.
		int [] arr = new int[-10];	// NegativeArraySizeException 발생 - 왜? 배열크기를 음수로 잡았기 때문에
		int [] arr2 = new int[5];	
		
		arr2[5] = 100;			// ArrayIndexOutOfBoundException 발생	 
		// 왜? 베열의 index범위(배열크기가 5인것이고 인덱스는 4까지이기 때문에 인덱스5번은 없다)를 넘어서 참조하는 경우
		t = (ExTest)new Ex();	// ClassCastException 발생
		// 왜? Cast 연산자 사용시 타입오류 - ExTest 타입이 안되기 때문이다
		}

}
