package oop.sample;

public class FamilyCount {

	private String name; // ����ʵ�
	private int age; 
	private char gender; 
	private int familyCount;

	
	public FamilyCount (String name, int age, char gender, int familyCount) {		// �Ű����� �ִ� ������
	 this.name=name;
	 this.age=age;
	 this.gender=gender;
	 this.familyCount=familyCount;
	 }
	
	 // getter, setter �޼ҵ�
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
		return "��������������? [" + familyCount +"��]";
	}
	
}

