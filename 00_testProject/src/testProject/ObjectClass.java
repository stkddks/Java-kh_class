package testProject;

public class ObjectClass {
	public static void main(String[] args) {
		
		class Student{		// ����ü. ����� ����
			int age;
			int score;
			String name;
		}		
		
		public class StudentTest {
			public static void main(String[] args) {
				Student s = new Student(); //�츮�� ���� ������ Ÿ��
				s.age = 20;
				s.score = 100;
				s.name = "����";
				System.out.println(s.age + " / "+ s.score + " / " + s.name);
			}
		}
		 
		CLASS reference = new CLASS();	// CLASS Ÿ���� reference ������, ���Ӱ� ���� CLASS ��ü�� ����!
		    
	}

}




/*
 * 
JAVA������ ��ü�� New �����ڷ� �����ϰ� �����Ѵ�.
//ClassŸ�� ������ = new ������ ();
//Class��� �ڷ����� Ÿ�� (int��, String�� �� ���� �ڷ���!)
// �ڷ����� �̸��� �ش�Ŭ������ �̸��� ����.
// �ش� Ŭ�����ڷ����� ������ �������ִ� ��! == ��ü ������ �ȴ�.
//// ��! Ŭ������ ��ü����_������ = new Ŭ����_�����ڸ�();


ex)
String str2 = new String("abc"); // StringŸ��(�ڷ���)�� ���� str2�� ���Ӱ�(new) String ��ü�� �����Ͽ�  ����!
 * 
 * 
 ex)
 public static void main(String[] args) {
  // CLASS Ÿ���� reference ������, ���Ӱ� ���� CLASS ��ü�� ����!
  CLASS reference = new CLASS();
}
 * 
 * 
 ex) 
 //����ü : �ٸ� Ÿ���� �������� ���� �ڷ���
//����� ���� �ڷ���
class Student{
    int age;
    int score;
    String name;
}

public class Stuent_Test {
    public static void main(String[] args) {
        Student s = new Student(); //�츮�� ���� ������ Ÿ��
        s.age = 20;
        s.score = 100;
        s.name = "����";
        System.out.println(s.age + " / "+ s.score + " / " + s.name);
    }
}

 * 
 * 
 * 
 */