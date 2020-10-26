package oop.test;

import oop.sample.FamilyCount;
import oop.sample.Major;
import oop.sample.Singer;

public class TestArray {

	public static void main(String[] args) {

		Major[] list1 = new Major[3]; // 3명을 보관할 수 있는 객체배열 선언
		FamilyCount[] list2 = new FamilyCount[3]; // 3명을 보관할 수 있는 객체배열 선언
		Singer[] list3 = new Singer[3]; // 3명을 보관할 수 있는 객체배열 선언
		
		String hungry;
		
		list1[0]=new Major("강성권", 28, '남', "안경광학", true);
		list1[1]=new Major("조용연", 27, '남', "산업경영", false);	
		list1[2]=new Major("이상아", 25, '여', "정보보호", false);	
		
		list2[0]=new FamilyCount("강성권", 28, '남', 5);
		list2[1]=new FamilyCount("조용연", 27, '남', 4);	
		list2[2]=new FamilyCount("이상아", 25, '여', 3);	
		
		list3[0]=new Singer("강성권", 28, '남', "나훈아");
		list3[1]=new Singer("조용연", 27, '남', "소금");	
		list3[2]=new Singer("이상아", 25, '여', "데이식스");	
		
		
		for(int i=0; i<list1.length;i++){			//각 객체의 멤버에 접근 
			
			if (list1[i].getHungry() == true) 
				hungry = "응. 항상 고파";
			else 
				hungry = "응. 조금";
			System.out.println("Who are you?");
			System.out.println();
			System.out.print("넌 누구고 전공이 뭐야? ");
			System.out.println(list1[i].toString());
			System.out.println(list2[i].toString());
			System.out.println(list3[i].toString());
			System.out.println("*** 뽀나스! *** \n배고파? " + hungry +"\n");
			
		}
	}
}