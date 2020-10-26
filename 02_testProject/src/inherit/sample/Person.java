package inherit.sample;

public abstract class Person {
	private String name;

	public Person() {
	}

	public Person(String name) {
		this.name = name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public abstract void out(); // �߻�Ŭ������ �߻�޼ҵ�
	// �ڽ�Ŭ�������� ������ �߻�޼ҵ��� out(), �̰��� �����ؾ��Ѵ�
}

//�� ���� �̰��� ���ĸ� �ڵ� �ܼ�ȭ�� �ڽ� Ŭ�������� ��� ����� �� �ְ� 
//interface ���� ���� - �߻�޼ҵ�θ� ������ �߻�Ŭ������ interface��� �Ѵ�.
//interface �� 
//�޼ҵ�� �������� ���̴� ��ȯŸ���� �ֳ� ������ �����̴�.

// �⺻�����ڴ� �츮�� ������ �ʾƵ� �����Ϸ��� �ڵ����� �������ش�.
// ��¥�� �������ֱ⿡ �츮�� ��Ģ������ ���ִ� ���̴�.
