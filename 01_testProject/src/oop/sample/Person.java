package oop.sample;

public class Person {

	private String name; // 멤버필드
	private int age; 
	private char gender; 
	private String major;
	private int familyCount;
	private String singer; 
	private boolean hungry;
	
	public Person() {}	// 기본 생성자
	public Person (String name, int age, char gender, String major, int familyCount, String singer, boolean hungry) {		// 매개변수 있는 생성자
	 this.name=name;
	 this.age=age;
	 this.gender=gender;
	 this.major=major;
	 this.familyCount=familyCount;
	 this.singer=singer;
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
	
	public int getFamilyCount() { return familyCount; }
	public void setFamilyCount(int familyCount) { this.familyCount = familyCount; }
	
	public String getSinger() { return singer; }
	public void setSinger(String singer) { this.singer= singer; }
	
	public boolean getHungry() { return hungry; }
	public void setHungry(String hungry) { this.singer= hungry; }
	
	@Override
	public String toString() {
		return "Person [이름=" + name + ", 나이=" + age + ", 성별=" + gender + ", 전공=" + major + ", 가족구성원수="
				+ familyCount + ", 좋아하는가수=" + singer +"]";
	}
	
}

