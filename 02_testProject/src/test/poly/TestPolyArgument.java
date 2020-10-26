package test.poly;

public class TestPolyArgument {
	public static void main(String[] args) {
		Buyer b = new Buyer();
		b.buy (new Chair( ));
		b.buy (new Desk( ));
	}
}


class Furniture {
	protected int price; //제품가격
	public Furniture (int price) {
		this.price = price;
	}
}

class Chair extends Furniture {
	public Chair() {
		super(100); // 부모 클래스의 생성자 호출
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



// 원래의 Buyer 클래스 코드 (아래의 코드와 비교하기)
// 매개변수의 타입으로 Furniture 인 변수 f를 받고있다
// 부모타입인 Furniture 덕분에 
// 자식클래스인 Chair, Desk 모두 하나의 메소드를 사용할 수 있다
class Buyer1 {
	private int money = 500;
	public void buy(Furniture f){
		if (money<f.price) {
			System.out.println("잔액부족!");
			return;
		}
		money -= f.price;
		System.out.println(f+" 구매성공! 잔액: "+money+" 만원");
	}
}



// Chair,Desk 를 매개변수로 받은 경우 (위의 경우와 차이를 보기)
class Buyer {
	int money = 500;
	//Chair 구매메소드
	void buy(Chair c){
		if (money<c.price) {
			System.out.println("잔액부족!");
			return;
		}
		money -= c.price;
		System.out.println(c+" 구매성공! 잔액: "+money+" 만원");
	}
	//Desk 구매메소드
	void buy(Desk d){
		if (money<d.price) {
			System.out.println("잔액부족!");
			return;
		}
		money -= d.price;
		System.out.println(d+" 구매성공! 잔액: "+money+" 만원");
	}
}




