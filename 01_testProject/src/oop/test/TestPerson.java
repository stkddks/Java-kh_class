package oop.test;

import oop.sample.vo.Person;

public class TestPerson {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Person p1 = new Person();
		Person p2 = new Person("ȫ�浿", 25, '��');
		
		p1.display();
		p2.display();
	}

}
