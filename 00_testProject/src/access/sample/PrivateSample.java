package access.sample;	//패키지명

public class PrivateSample {
	private int num;	// 선언된 클래스 안에서만 접근 가능
//	private String str;
//	public String getstr();
	
	public int getNum() {	// 값 호출을 위한 Getter함수
		return num;
	}
	public void setNum(int num) {	// 값 대입을 위한 Setter
		this.num = num;	//setNum(int num) 라는 메소드를 가리킨다
	}
}

// 접근제한자의 공개범위는 public > protected > default > private

//private만 getter/setter 함수 쓴다. 밖에서 갖다 쓰려면 이렇게 써라. 라고 이해하면되
// getter / setter 한번에 생성하는 법
// 우클릭 - source - generate Getter and Setters
// 