package misson;

public class BTS {

	private String title;
	private String artist;
	private int year;
	private String countey;
	
	void show() { 		//메소드
		System.out.println("10월 셋째주 차트 1위의 영광은요~~~~~");
		System.out.println(title+ " " + artist+ "입니다!!!!!");
		System.out.println("Congratulations");
	}
	
	//public BTS() {}		//생성자
	
	public BTS(String title, String artist, int year, String country) {
		this.title = title;
		this.artist = artist;
		this.year = year;
		this.countey=country;
	}	
	// this 는 클래스의 변수명과 같이 써야할 때, 구분을 위해서(?) 쓰는겨
	// this.title은 class안의 변수인 String title을 가르키다는 소리지!
	
	
	public static void main(String[] args) {
		BTS myFavorite = new BTS("Dynamite", "BTS", 2020, "KOREA");
		myFavorite.show();	// show() 메소드 호출
	}

}
