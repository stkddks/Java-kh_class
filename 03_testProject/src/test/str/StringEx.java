package test.str;
public class StringEx {
public void testString() {
	String str = "Hello Java"; // ���鵵 �ϳ��� ���ڷ� ���
	String concat, upperCase, replace, subString;
	
	System.out.println("�⺻ String : "+ str);
	System.out.println("�⺻ String ���� : "+str.length()); // ���ڿ� ���� ���
	
	concat = str.concat(", Hi Java"); // ���ڿ� ����
	upperCase = concat.toUpperCase(); // ���ڿ� �빮�ڷ� ��ȯ
	replace = upperCase.replace('J', 'L');// ���� J�� L�� ��ȯ
	subString = replace.substring(3, 10); // 3~9��° ��ġ�� ���ڿ� �߶󳻱�
	
	System.out.println("Concat String : " + concat);
	System.out.println("upperCase String : " + upperCase);
	System.out.println("replace String : " + replace);
	System.out.println("subString String : " + subString);
}
}