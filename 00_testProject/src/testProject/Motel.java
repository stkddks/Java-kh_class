package testProject;
import java.util.*;
public class Motel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		boolean[] room = new boolean[10];
		// �� ���� 0, �� ���� 1.
		while (true) {
			System.out.println("���������������������������������� ���� ���α׷�������������������������������");
			System.out.println("1.�Խ� \t 2.��� \t 3.�� ��Ȳ \t 4.����");
			System.out.println("������������������������������������������������������������������������������������������������");

			int roomNum = 99;

			System.out.print("���� > ");
			int choice = sc.nextInt();

			switch (choice) {
			case 1:

				System.out.print("�� �� �濡 �Խ��Ͻðڽ��ϱ�? ");
				roomNum = sc.nextInt() - 1;

//				while (true) {
//					if (roomNum < 0 || 9 < roomNum) {
//						System.out.println();
//						System.out.println("���� ���ڿ� �غ�� ���� 1�� ����� 10�� ������Դϴ�.");
//						System.out.print("�ٽ� �Է����ּ��� > ");
//						roomNum = sc.nextInt() - 1;
//						System.out.println();
//					} else {
//						break;
//					}
//				}

				if (room[roomNum]) {
					System.out.println((roomNum + 1) + "�� ���� �̹� �մ��� ��ʴϴ�.");
					System.out.println();

					break;
				}
				room[roomNum] = true;
				System.out.println((roomNum + 1) + "�� �濡 �Խ��ϼ̽��ϴ�.");
				System.out.println("���� ���� �������");
				System.out.println();

				break;
			case 2:
				System.out.print("�� �� �濡�� ����Ͻðڽ��ϱ�? ");
				roomNum = sc.nextInt() - 1;

//				while (true) {
//					if (roomNum < 0 || 9 < roomNum) {
//						System.out.println();
//						System.out.println("���� ���ڿ� �غ�� ���� 1�� ����� 10�� ������Դϴ�.");
//						System.out.print("�ٽ� �Է����ּ��� > ");
//						roomNum = sc.nextInt() - 1;
//						System.out.println();
//					} else {
//						break;
//					}
//				}

				if (!room[roomNum]) {
					System.out.println("�����Ͻ� " + (roomNum + 1) + "�� ���� �̹� ����ֽ��ϴ�.");
					System.out.println();
					break;
				}
					room[roomNum] = false;
					System.out.println((roomNum + 1) + "�� �濡�� ����ϼ̽��ϴ�.");
					System.out.println("���� �Ϸ� ��������");
					System.out.println();

				break;
			case 3:
				for (int i = 0; i < room.length; i++) {
					if (room[i]) {
						System.out.println("\t" + (i + 1) + "�� ���� ���� �մ��� �ֽ��ϴ�.");
					} else {
						System.out.println("\t" + (i + 1) + "�� ���� ���� ����ֽ��ϴ�.��");
					}
				}
				break;
			case 4:
				System.out.println("���� �Ϸ� ��� �����̽��ϴ� �����!");
				sc.close();
				return;
			}
		}
	

	}

}
