package oop.sample;

public class Major {

	private String name; // ����ʵ�
	private int age; 
	private char gender; 
	private String major;
	private boolean hungry;
	
	public Major (String name, int age, char gender, String major, boolean hungry) {		// �Ű����� �ִ� ������
	 this.name=name;
	 this.age=age;
	 this.gender=gender;
	 this.major=major;
	 this.hungry=hungry;
	}
	
	 // getter, setter �޼ҵ�
	public String getName() { return name; }
	public void setName(String name) { this.name= name; }
	
	public int getAge() { return age; }
	public void setAge(int age) { this.age = age; }
	
	public char getGender() { return gender; }
	public void setGender(char gender) { this.gender= gender; }
	
	public String getMajor() { return major; }
	public void setMajor(String major) { this.major= major; }
	
	public boolean getHungry() { return hungry; }
	public void setHungry(String hungry) { this.name= hungry; }
	
	@Override
	public String toString() {
		return "[�̸�=" + name + ", ����=" + age + ", ����=" + gender + ", ����=" + major + "]";
	}
	
}

