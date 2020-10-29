package trycatch;


class ExceptionTest1 extends RuntimeException{ // Unchecked
	ExceptionTest1() {
		super();
	}
	ExceptionTest1(String message) {
		super(message);
	}
}
class ExceptionTest2 extends Exception{ // Checked
	ExceptionTest2() {
		super();
	}
	ExceptionTest2(String message) {
		super(message);
	}
}

class Calculator{
	public void div(int data1, int data2) {
		if(data1==0 || data2==0) {
			throw new ExceptionTest1("0으로는 나눌수 없습니다.");
			//throw new ExceptionTest2("0으로는 나눌수 없습니다.");
		}
		System.out.println(data1/data2);
	}
}

public class EXC {
	
	public static void main(String[] args) {
		Calculator c = new Calculator();
		c.div(10, 0);
		
	}

}

