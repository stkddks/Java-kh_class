

//문자열을 다룰 때 사용하며, 문자열을 변경할 때마다 새로운 객체를 생성하는 String 클래스와 다르게 문자열
//변경 시 새로운 객체를 생성하지 않고, 버퍼에 담겨 있는 문자열을 바로 수정한다
/*
 * StringBuffer 클래스와 StringBuilder 클래스의 객체는 객체 생성 시 크기를 지정하지 않으면 기본적으로 16개
의 문자를 저장할 수 있는 버퍼를 가진다. StringBuffer 클래스와 StringBuilder 클래스는 기본적인 동작은 같
으며 StringBuffer 클래스만 동기화(Thread Safe)를 지원한다는 점이 다르다

 */

package test.str;

public class StringBufferEx {
	public void testStringBuffer() {
		StringBuffer str1 = new StringBuffer();
		StringBuffer str2 = new StringBuffer(30);
		StringBuffer str3 = new StringBuffer("Java");
		str1.append("HI");
		str2.append("Hello");
		str3.insert(0, str2 + " ");
		System.out.println(str1);
		System.out.println(str2);
		System.out.println(str3);
	}
}