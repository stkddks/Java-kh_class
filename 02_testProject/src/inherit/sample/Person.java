package inherit.sample;

public abstract class Person {
	private String name;

	public Person() {
	}

	public Person(String name) {
		this.name = name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public abstract void out(); // 추상클래스의 추상메소드
	// 자식클래스들은 강제로 추상메소드인 out(), 이것을 구현해야한다
}

//왜 굳이 이것을 쓰냐면 코드 단순화와 자식 클래스들이 모두 사용할 수 있게 
//interface 와의 관계 - 추상메소드로만 구성된 추상클래스를 interface라고 한다.
//interface 가 
//메소드와 생성자의 차이는 반환타입이 있냐 없냐의 차이이다.

// 기본생성자는 우리가 써주지 않아도 컴파일러가 자동으로 생성해준다.
// 어짜피 생성해주기에 우리가 원칙적으로 써주는 것이다.
