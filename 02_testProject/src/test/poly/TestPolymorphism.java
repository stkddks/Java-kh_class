package test.poly;

import inherit.sample.Parent;
import poly.sample.Child;

public class TestPolymorphism {
	public static void main(String[] args) {
		
		Child c = new Child();
		System.out.println(c.x);
		c.display();
		c.out();
		System.out.println();
		
		Parent p = new Child(); 	// �����ڰ� child�ӿ� ����
		p.display(); //Overriding �� parent ����̹Ƿ� ���� ����. 
		//child���� �������̵� �����ϱ� child�� display�� ��µȴ�.
		
		//p.out(); 	//�����Ͽ���. Parent Ÿ������ Child ����� ������ �� ����.
	}
}
