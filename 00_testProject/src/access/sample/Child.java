package access.sample;

public class Child extends Parent{		//ParentŬ������ ��ӹ޴´�
	public void insert() {
		num=10;	
		// Pareent Ŭ���������� num���� ���������ڴ� protected ��
		// protected ����� ��ӵ� �ļ� �������� ��� ������!!!!!!
		// �θ� �ڽı����� ��ȣ�Ѵٰ� �����ϸ� �ȴ�
	}
	public void out() {
		System.out.println(num);
	}
}
