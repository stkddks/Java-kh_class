package access.sample;	//��Ű����

public class PrivateSample {
	private int num;	// ����� Ŭ���� �ȿ����� ���� ����
//	private String str;
//	public String getstr();
	
	public int getNum() {	// �� ȣ���� ���� Getter�Լ�
		return num;
	}
	public void setNum(int num) {	// �� ������ ���� Setter
		this.num = num;	//setNum(int num) ��� �޼ҵ带 ����Ų��
	}
}

// ������������ ���������� public > protected > default > private

//private�� getter/setter �Լ� ����. �ۿ��� ���� ������ �̷��� ���. ��� �����ϸ��
// getter / setter �ѹ��� �����ϴ� ��
// ��Ŭ�� - source - generate Getter and Setters
// 