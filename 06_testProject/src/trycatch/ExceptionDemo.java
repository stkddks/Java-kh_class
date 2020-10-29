package trycatch;

import java.util.Scanner;

public class ExceptionDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		System.out.println("-----나눗셈------");
		System.out.println("첫번째 수 입력: ");
		int data1 = sc.nextInt();
		System.out.println("두번째 수 입력: ");
		int data2 = sc.nextInt();
		
		try {
			int result = data1/data2;
			System.out.println("결과: " +result);
		}
		catch(ArithmeticException e) {
			System.out.println("숫자 0은 노노해~");
		}
		
		System.out.println("감사합니다");
		sc.close();
	}

}
