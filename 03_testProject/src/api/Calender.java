package api;

import java.util.Calendar;

public class Calender {
	public static void main(String[] args) {
	
	Calendar today = Calendar.getInstance();	
	// getInstance 를 통해 자식객체(GregorianCalendar)를 생성함
	// GregorianCalendar는 한구 표준 시간대의 대한 정보를 가져옴
	
	System.out.println(today.get(Calendar.YEAR)); 		  // 년도 출력
	System.out.println( today.get(Calendar.MONTH)+1 ); // 0 ~ 11 => +1을 해야함
	System.out.println( today.get(Calendar.DATE) ); // 일
	System.out.println( today.get(Calendar.AM_PM) ); // 오전0 , 오후1		
	System.out.println( today.get(Calendar.HOUR) ); // 시간		
	System.out.println( today.get(Calendar.MINUTE) ); // 분		
	System.out.println( today.get(Calendar.SECOND) ); // 초		
	System.out.println( today.get(Calendar.DAY_OF_WEEK) ); // 일요일 1  ~ 토요일7
	
	today.set(Calendar.YEAR, 2016);
	System.out.println(today.get(Calendar.YEAR));
	}
}
