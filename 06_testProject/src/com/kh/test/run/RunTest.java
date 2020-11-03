package com.kh.test.run;

import java.util.*;

public class RunTest{
	
	public static void main(String[] args) {
		
		Random ran = new Random();
		
		Scanner sc = new Scanner(System.in);
		
		HashSet <Integer> set = new HashSet <Integer>;
		
		System.out.println("출력할 횟수 입력: ");
		
		int a = sc.nextInt();​
		
		
		
		
		while(set.size() < 6) {		
			
			int num= ran.nextInt(45);​
			
			//int num = (int)(Math.random()*45+1);		//1~45 난수발생
			
			
			set.add(num);
			
		}
		
		
		
		for(int i=0; i<a; i++){
			
			ArrayList<Integer> list = new ArrayList​<Integer>(set);	
			
			Collections.sort(list);		
			
			System.out.println("\nLotto: " +list);
			
		}
		​
	}

}