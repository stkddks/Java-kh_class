package oop.test;

import oop.sample.FamilyCount;
import oop.sample.Major;
import oop.sample.Singer;

public class TestArray {

	public static void main(String[] args) {

		Major[] list1 = new Major[3]; // 3���� ������ �� �ִ� ��ü�迭 ����
		FamilyCount[] list2 = new FamilyCount[3]; // 3���� ������ �� �ִ� ��ü�迭 ����
		Singer[] list3 = new Singer[3]; // 3���� ������ �� �ִ� ��ü�迭 ����
		
		String hungry;
		
		list1[0]=new Major("������", 28, '��', "�Ȱ汤��", true);
		list1[1]=new Major("���뿬", 27, '��', "����濵", false);	
		list1[2]=new Major("�̻��", 25, '��', "������ȣ", false);	
		
		list2[0]=new FamilyCount("������", 28, '��', 5);
		list2[1]=new FamilyCount("���뿬", 27, '��', 4);	
		list2[2]=new FamilyCount("�̻��", 25, '��', 3);	
		
		list3[0]=new Singer("������", 28, '��', "���ƾ�");
		list3[1]=new Singer("���뿬", 27, '��', "�ұ�");	
		list3[2]=new Singer("�̻��", 25, '��', "���̽Ľ�");	
		
		
		for(int i=0; i<list1.length;i++){			//�� ��ü�� ����� ���� 
			
			if (list1[i].getHungry() == true) 
				hungry = "��. �׻� ����";
			else 
				hungry = "��. ����";
			System.out.println("Who are you?");
			System.out.println();
			System.out.print("�� ������ ������ ����? ");
			System.out.println(list1[i].toString());
			System.out.println(list2[i].toString());
			System.out.println(list3[i].toString());
			System.out.println("*** �ǳ���! *** \n�����? " + hungry +"\n");
			
		}
	}
}