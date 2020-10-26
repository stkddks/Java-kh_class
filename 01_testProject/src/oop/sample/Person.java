package oop.sample;

public class Person {

	private String name; // ����ʵ�
	private int age; 
	private char gender; 
	private String major;
	private int familyCount;
	private String singer; 
	private boolean hungry;
	
	public Person() {}	// �⺻ ������
	public Person (String name, int age, char gender, String major, int familyCount, String singer, boolean hungry) {		// �Ű����� �ִ� ������
	 this.name=name;
	 this.age=age;
	 this.gender=gender;
	 this.major=major;
	 this.familyCount=familyCount;
	 this.singer=singer;
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
	
	public int getFamilyCount() { return familyCount; }
	public void setFamilyCount(int familyCount) { this.familyCount = familyCount; }
	
	public String getSinger() { return singer; }
	public void setSinger(String singer) { this.singer= singer; }
	
	public boolean getHungry() { return hungry; }
	public void setHungry(String hungry) { this.singer= hungry; }
	
	@Override
	public String toString() {
		return "Person [�̸�=" + name + ", ����=" + age + ", ����=" + gender + ", ����=" + major + ", ������������="
				+ familyCount + ", �����ϴ°���=" + singer +"]";
	}
	
}

