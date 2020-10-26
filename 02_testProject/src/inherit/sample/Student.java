package inherit.sample;

public class Student extends Person {
	private String subject;

	public Student() {
		super();
	}

	public Student(String subject) {
		super();
		this.subject = subject;
	}

	public Student(String name, String subject) {
		super(name);
		this.subject = subject;
	}

	@Override
	public void out() { // ��ӹ��� �θ��� �߻�޼ҵ�� �ݵ�� �������̵��ؾ� ��
		System.out.println(getName() + " �л��Դϴ�");
		System.out.println(subject + "�� �����մϴ�");
	}
}
