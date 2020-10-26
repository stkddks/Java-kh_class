package oop.sample;

public class Singer {

	private String name; // ����ʵ�
	private int age; 
	private char gender; 
	private String singer; 
	
	public Singer (String name, int age, char gender, String singer) {		// �Ű����� �ִ� ������
	 this.name=name;
	 this.age=age;
	 this.gender=gender;
	 this.singer=singer;
	}
	
	 // getter, setter �޼ҵ�
	public String getName() { return name; }
	public void setName(String name) { this.name= name; }
	
	public int getAge() { return age; }
	public void setAge(int age) { this.age = age; }
	
	public char getGender() { return gender; }
	public void setGender(char gender) { this.gender= gender; }
	
	public String getSinger() { return singer; }
	public void setSinger(String singer) { this.singer= singer; }
	
	@Override
	public String toString() {
		return "�����ϴ� ������? [" + singer +"]";
	}
	
}

