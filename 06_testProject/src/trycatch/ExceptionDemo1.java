


/*
 * 다음코드를 실행하였을때 숫자가 아닌 다른 문자를 입력하면 에러가 발생하게 됨 
 * 에러가 발생하지 않게 Exception 처리를 하도록 하여라
 * ex) 에러 발생시 "숫자를 입력해주세요" 라는 코드가 출력되도록 만들어라
 */

package trycatch;
import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionDemo1 {
	Scanner sc = new Scanner(System.in);
	
	public void menuPrint()
	{
		System.out.println("--------- 메뉴 선택 -----------");
		System.out.println("1. 반갑습니다. 출력");
		System.out.println("2. 잘지내세요. 출력");
		System.out.println("3. 또 만나요 출력");
		System.out.print("입력 : ");
	}
	public void ExceptionDemo1_Print(int choice)
	{
		switch(choice)
		{
		case 1: System.out.println("반갑습니다"); break; 
		case 2: System.out.println("잘지내세요"); break;
		case 3: System.out.println("또 만나요"); break;
		default : System.out.println("1~3 에서 선택해주세요");
		}
		
	}
	public void start()
	{
		try {
			int choice = 0;
			this.menuPrint();
			choice = sc.nextInt();
			ExceptionDemo1_Print(choice);
		}
		catch(InputMismatchException e) {
			System.out.println("숫자를 입력해주세요^^");
		}
	}
	
	public static void main(String [] args)
	{
		ExceptionDemo1 e = new ExceptionDemo1();
		e.start();
	}
	
}

