package test.inherit;

import inherit.sample.Child;
import inherit.sample.Parent;

public class TestOverriding {
	public static void main(String[] args) {
		Parent p = new Parent();
		p.display();
// p.out() //�θ�ü�� �ڽİ�ü�� ����� ������ �� ����
		Child c = new Child();
		c.out();
		c.display();
	}
}
