
// ����ǥ�� ����ϴ� ���α׷� �����
// 2���� �迭�� ����� ������ �ʱ�ȭ �� ��
// ���κ� ������ ����� ���հ�, �հ�, ����� ����Ϸ� ����Ͻ�


package misson;

public class Practice11 {

	public static void main(String[] args) {
		
		String title[] = {"�̸�", "����", "����", "����", "�հ�", "���"};
		String name[] = {"ȫ�浿", "�̼���", "������"};
		int[][] score = new int[][]{{80,90,77}, {78,97,86}, {71,68,88}};
		//int sums=0;
		int sum2=0, sum3=0, sum4=0, sums=0;;
		
		System.out.println("===================A�� ����ǥ==================");
		for(int i=0; i<title.length; i++) {
			System.out.printf(title[i] +"\t");
		}
		System.out.println("\n=============================================");

		for (int i=0; i<score.length; i++) { 
			System.out.printf(name[i] + "\t");
			int sum = 0;
			for (int j=0; j<score[i].length; j++) {
				System.out.printf(score[i][j] + "\t");
				sum += score[i][j];
			}
			System.out.printf(sum+ "\t");
			System.out.printf("%.1f%n", (double)sum/3);	//%f�� �Ҽ��� ���·� ǥ���Ѵٴ� �ǹ�
			sums += sum;
		}
		System.out.println("=============================================");
		for (int j=0; j<score.length; j++) { 
			sum2 += score[j][0];
			sum3 += score[j][1];
			sum4 += score[j][2];
			}
		System.out.println("�հ� \t" + sum2 + "\t" + sum3 + "\t" + sum4 +"\t"+ sums +"\t" + sums/9);
	}
}

