package oop.sample.vo;

public class Person {

	private String name;
	private int age;
	private char gender;
	
	public Person() {}
	public Person (String name, int age, char gender) {
		this.name = name;
		this.age = age;
		this.gender = gender;
	}
	
	public void display() {
		System.out.println(name+"," +age+ "��," +gender+ "��");
	}
}
