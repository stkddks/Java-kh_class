package api;

import java.util.Calendar;

public class Calender {
	public static void main(String[] args) {
	
	Calendar today = Calendar.getInstance();	
	// getInstance �� ���� �ڽİ�ü(GregorianCalendar)�� ������
	// GregorianCalendar�� �ѱ� ǥ�� �ð����� ���� ������ ������
	
	System.out.println(today.get(Calendar.YEAR)); 		  // �⵵ ���
	System.out.println( today.get(Calendar.MONTH)+1 ); // 0 ~ 11 => +1�� �ؾ���
	System.out.println( today.get(Calendar.DATE) ); // ��
	System.out.println( today.get(Calendar.AM_PM) ); // ����0 , ����1		
	System.out.println( today.get(Calendar.HOUR) ); // �ð�		
	System.out.println( today.get(Calendar.MINUTE) ); // ��		
	System.out.println( today.get(Calendar.SECOND) ); // ��		
	System.out.println( today.get(Calendar.DAY_OF_WEEK) ); // �Ͽ��� 1  ~ �����7
	
	today.set(Calendar.YEAR, 2016);
	System.out.println(today.get(Calendar.YEAR));
	}
}
