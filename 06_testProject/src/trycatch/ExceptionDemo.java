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

/*
 Q. 다음 아래와 같은 코드가 있을때 숫자가 아닌 문자를 입력하게 되면 Exception이 발생 하게 되고, 프로그램이 종료 되어 버림
예외가 발생하게 되면, "정수만 입력해주세요" 라는 글자가 출력되고 마지막에 있는 "수고하셨습니다."가 정상
출력될 수 있도록 코드를 개선하시오

package trycatch;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionDemo {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		try {
			System.out.println("첫번째 수 입력: ");
			int su1 = sc.nextInt();
			System.out.println("두번째 수 입력: ");
			int su2 = sc.nextInt();
			System.out.printf("%d + %d = %d\n", su1, su2, su1+su2);
			System.out.println("수고하셨습니다.");
		}
		catch(InputMismatchException e) {
			System.out.println("정수만 입력해주세요");
			System.exit(0);
		}
		sc.close();
	}
}

 */
