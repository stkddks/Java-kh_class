package test.poly;

public class TestPolyArgument {
	public static void main(String[] args) {
		Buyer b = new Buyer();
		b.buy (new Chair( ));
		b.buy (new Desk( ));
	}
}


class Furniture {
	protected int price; //��ǰ����
	public Furniture (int price) {
		this.price = price;
	}
}

class Chair extends Furniture {
	public Chair() {
		super(100); // �θ� Ŭ������ ������ ȣ��
	}
	@Override
	public String toString(){
		return "Chair";
	}
}

class Desk extends Furniture {
	public Desk() {
		super(200);
	}
	@Override
	public String toString() {
		return "Desk";
	}
}



// ������ Buyer Ŭ���� �ڵ� (�Ʒ��� �ڵ�� ���ϱ�)
// �Ű������� Ÿ������ Furniture �� ���� f�� �ް��ִ�
// �θ�Ÿ���� Furniture ���п� 
// �ڽ�Ŭ������ Chair, Desk ��� �ϳ��� �޼ҵ带 ����� �� �ִ�
class Buyer1 {
	private int money = 500;
	public void buy(Furniture f){
		if (money<f.price) {
			System.out.println("�ܾ׺���!");
			return;
		}
		money -= f.price;
		System.out.println(f+" ���ż���! �ܾ�: "+money+" ����");
	}
}



// Chair,Desk �� �Ű������� ���� ��� (���� ���� ���̸� ����)
class Buyer {
	int money = 500;
	//Chair ���Ÿ޼ҵ�
	void buy(Chair c){
		if (money<c.price) {
			System.out.println("�ܾ׺���!");
			return;
		}
		money -= c.price;
		System.out.println(c+" ���ż���! �ܾ�: "+money+" ����");
	}
	//Desk ���Ÿ޼ҵ�
	void buy(Desk d){
		if (money<d.price) {
			System.out.println("�ܾ׺���!");
			return;
		}
		money -= d.price;
		System.out.println(d+" ���ż���! �ܾ�: "+money+" ����");
	}
}




