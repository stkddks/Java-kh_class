package inherit.sample;
public class Professor extends Person {
	private String major;
	public Professor ( ) { super ( ); }
	public Professor (String major) {
		super ( );
		this.major = major;
	}
	public Professor (String name, String major) {
		super (name);
		this.major = major;
	}
	@Override
	public void out() {
		System.out.println(getName ( ) + " �����Դϴ�");
		System.out.println(major + "�� �����մϴ�");
	};
}
