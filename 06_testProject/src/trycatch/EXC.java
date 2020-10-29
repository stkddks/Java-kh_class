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
			throw new ExceptionTest1("0���δ� ������ �����ϴ�.");
			//throw new ExceptionTest2("0���δ� ������ �����ϴ�.");
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

