

/* Ű����� ���� ���� ���� �Ǽ������� �Է¹޾� �簢���� ������ �ѷ��� ����Ͽ� ����ϼ���
 * ����: ����*���� // �ѷ�: (����+����)*2*/

package misson;
import java.util.Scanner;
public class Practice3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		   System.out.printf("����: ");
		   double wide = sc.nextDouble();
		   System.out.printf("����: ");
		   double hight = sc.nextDouble();
		    
		   double area= wide*hight;
		   double round = (wide+hight)*2;
		   
		   System.out.printf("���� : " +area+ "\n�ѷ� : "+round);
		   sc.close();
	}
}



