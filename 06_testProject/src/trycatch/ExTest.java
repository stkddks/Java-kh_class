

// ����ó���� �� ���������� ���õ��̴�
// RuntimeException�� �ļ�Ŭ�������� �߻� ����



package trycatch;

class Ex{
	
}
public class ExTest extends Ex{

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int data1 = 10;
		int data2 = 0;
		int result;
		
		ExTest t = null;		// ���� ���۷������� null�� �������
		result =  data1/data2;		//ArithmeticException �߻� - ��? data2�� 0�̴ϱ�
		t.hashCode();			// NullPointexception �߻� - ��? null�϶� �ؽ��ڵ� �� ���������ϸ� �� ��������.
		int [] arr = new int[-10];	// NegativeArraySizeException �߻� - ��? �迭ũ�⸦ ������ ��ұ� ������
		int [] arr2 = new int[5];	
		
		arr2[5] = 100;			// ArrayIndexOutOfBoundException �߻�	 
		// ��? ������ index����(�迭ũ�Ⱑ 5�ΰ��̰� �ε����� 4�����̱� ������ �ε���5���� ����)�� �Ѿ �����ϴ� ���
		t = (ExTest)new Ex();	// ClassCastException �߻�
		// ��? Cast ������ ���� Ÿ�Կ��� - ExTest Ÿ���� �ȵǱ� �����̴�
		}

}
