package trycatch;

import java.util.Scanner;

public class ExceptionDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		System.out.println("-----������------");
		System.out.println("ù��° �� �Է�: ");
		int data1 = sc.nextInt();
		System.out.println("�ι�° �� �Է�: ");
		int data2 = sc.nextInt();
		
		try {
			int result = data1/data2;
			System.out.println("���: " +result);
		}
		catch(ArithmeticException e) {
			System.out.println("���� 0�� �����~");
		}
		
		System.out.println("�����մϴ�");
		sc.close();
	}

}
