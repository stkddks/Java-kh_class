package access.test;
import access.sample.PrivateSample;	// Ŭ���� ȣ��
public class TestPrivate {
	public static void main(String[] args) {
		PrivateSample psamp = new PrivateSample();	
		// PrivateSample()��� Ŭ������ �����Ѵ�?ȣ���Ѵ�?
		// ������ �Ѵٰ� �ߴµ� ������ ���ؼ� ������ ����.
		// import�� �����ؾ��� Ŭ���� ��ġ ÷��
		// ������ ���� psamp��� �̸����� ���� ���ٴ� �ǹ�
		
		psamp.num=10;	// private �̹Ƿ� ���� ���� �߻�
		psamp.setNum(10);	// public �̹Ƿ� ���� ����
		
		// class �ȿ����� ���� ȣ���� ������ get/set �� ����Ѵ�.
		// �Ϲ������� num=10 �� �ȵȴٴ� �Ҹ���
		// set���� �ҷ��ͼ� ���� ��������� ��!!!
		
		System.out.println(psamp.getNum());		
		//getNum �� public �̹Ƿ� ���� ����
	}
}


/*

JAVA������ ��ü�� New �����ڷ� �����ϰ� �����Ѵ�.
ClassŸ�� ������ = new ������ ();
// Ŭ������ ��ü����_������ = new Ŭ����_�����ڸ�();
// 
ClassŸ���� �ڷ����̿�
�� �ڸ����� �ڷ����� ���� ��

ex)
String str2 = new String("abc"); // String Ÿ���� ���� str2�� ���Ӱ�(new) String ��ü�� �����Ͽ�  ����!
 
ex)
 public static void main(String[] args) {
  // CLASS Ÿ���� reference ������, ���Ӱ� ���� CLASS ��ü�� ����!
  CLASS reference = new CLASS();
}


*/