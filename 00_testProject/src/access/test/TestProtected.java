package access.test;

import access.sample.Child;
import access.sample.Parent;

public class TestProtected {
	public static void main(String[] args) {
		Parent parent = new Parent();	// ��ü����
		Child child = new Child();		//��ü���� //Ŭ������ ��ü����_������ = new Ŭ����_�����ڸ�();
		
		parent.num = 10;	// protected ����� �ٸ� ��Ű�������� Ŭ���� �ۿ����� ���� �Ұ� !!!!!!!!!!!!
		// protected ����� ��ӵ� �ļ� �������� ��� ������!!!!!!
		// �θ� �ڽı����� ��ȣ�Ѵٰ� �����ϸ� �ȴ�
		
		child.insert();
		child.out();
	}
}


//
//JAVA������ ��ü�� New �����ڷ� �����ϰ� �����Ѵ�.
//// Ŭ������ ��ü����_������ = new Ŭ����_�����ڸ�();
//Ŭ������ �ڷ����� ������ �����ϴ� �� 
// ex)
//Complex k = new Complex();
//Complex ���� ���� k�� �����ϰ�
// ���� k�� ���ӰԸ��� Complex ��ü�� ����!