package testProject;

import java.util.Scanner;

public class Main {
		public static void main(String[] args) {
			
			Scanner sc = new Scanner(System.in);
			
			Television myTv = new Television();
			System.out.println("TV를 켜시겠습니까? : (TurnOn: true / TurnOff: false)");
			boolean power1 = sc.nextBoolean();
			myTv.setPower(power1);
			
			
//			System.out.println("TV를 켜시겠습니까? : (TurnOn: true / TurnOff: false)");
//			
//			
//			String power = sc.next();
//			if(power.equals("true")) {
//				 myTv.turnOn(power);}
//			else if(power.equals("false")) { 
//				myTv.turnOff();}
//			else {
//				System.out.println("시스템을 종료합니다.");}
//			
			  //myTv.print();
			  
			  //int ch = myTv.getChannel();
		
		}

	
	}


