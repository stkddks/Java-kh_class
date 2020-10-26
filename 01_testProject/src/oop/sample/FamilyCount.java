package oop.sample;

public class FamilyCount {

	private String name; // 멤버필드
	private int age; 
	private char gender; 
	private int familyCount;

	
	public FamilyCount (String name, int age, char gender, int familyCount) {		// 매개변수 있는 생성자
	 this.name=name;
	 this.age=age;
	 this.gender=gender;
	 this.familyCount=familyCount;
	 }
	
	 // getter, setter 메소드
	public String getName() { return name; }
	public void setName(String name) { this.name= name; }
	
	public int getAge() { return age; }
	public void setAge(int age) { this.age = age; }
	
	public char getGender() { return gender; }
	public void setGender(char gender) { this.gender= gender; }
	
	public int getFamilyCount() { return familyCount; }
	public void setFamilyCount(int familyCount) { this.familyCount = familyCount; }
	
	@Override
	public String toString() {
		return "가족구성원수는? [" + familyCount +"명]";
	}
	
}

