package access.test;
import access.sample.PublicSample;	// 클래스 호출
public class TestPublic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PublicSample pbt = new PublicSample();
		
		pbt.num = 10;
		System.out.println(pbt.num);

	}

}
