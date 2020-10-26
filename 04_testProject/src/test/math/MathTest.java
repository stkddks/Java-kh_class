
/*
 * 
 * 숫자 계산에 흔히 사용되는 수학적 기능을 가지는 메소드를 제공하는 클래스
모든 메소드들이 정적 메소드로 정의되어 있어 객체를 생성하지 않고 사용한다


*/

package test.math;
public class MathTest {
	public void printMath() {
		System.out.println("abs(-10) : "+Math.abs(-10)); // -10의 절대값
		System.out.println("ceil(3.7) : "+Math.ceil(3.7)); // 3.7의 올림
		System.out.println("floor(3.7) : "+Math.floor(3.7)); // 3.7의 내림
		System.out.println("exp(3.3) : "+Math.exp(3.3)); // e^3.3
		System.out.println("pow(2.1,2) : "+Math.pow(2.1, 2)); // 2.1^2
		System.out.println("random() : "+Math.random()); // 0.0 ~ 1.0 사이의 난수
	}
}