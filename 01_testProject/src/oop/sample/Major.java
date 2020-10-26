package oop.sample;

public class Major {

	private String name; // 멤버필드
	private int age; 
	private char gender; 
	private String major;
	private boolean hungry;
	
	public Major (String name, int age, char gender, String major, boolean hungry) {		// 매개변수 있는 생성자
	 this.name=name;
	 this.age=age;
	 this.gender=gender;
	 this.major=major;
	 this.hungry=hungry;
	}
	
	 // getter, setter 메소드
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
		return "[이름=" + name + ", 나이=" + age + ", 성별=" + gender + ", 전공=" + major + "]";
	}
	
}

