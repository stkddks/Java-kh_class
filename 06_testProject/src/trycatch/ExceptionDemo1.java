


/*
 * �����ڵ带 �����Ͽ����� ���ڰ� �ƴ� �ٸ� ���ڸ� �Է��ϸ� ������ �߻��ϰ� �� 
 * ������ �߻����� �ʰ� Exception ó���� �ϵ��� �Ͽ���
 * ex) ���� �߻��� "���ڸ� �Է����ּ���" ��� �ڵ尡 ��µǵ��� ������
 */

package trycatch;
import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionDemo1 {
	Scanner sc = new Scanner(System.in);
	
	public void menuPrint()
	{
		System.out.println("--------- �޴� ���� -----------");
		System.out.println("1. �ݰ����ϴ�. ���");
		System.out.println("2. ����������. ���");
		System.out.println("3. �� ������ ���");
		System.out.print("�Է� : ");
	}
	public void ExceptionDemo1_Print(int choice)
	{
		switch(choice)
		{
		case 1: System.out.println("�ݰ����ϴ�"); break; 
		case 2: System.out.println("����������"); break;
		case 3: System.out.println("�� ������"); break;
		default : System.out.println("1~3 ���� �������ּ���");
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
			System.out.println("���ڸ� �Է����ּ���^^");
		}
	}
	
	public static void main(String [] args)
	{
		ExceptionDemo1 e = new ExceptionDemo1();
		e.start();
	}
	
}

