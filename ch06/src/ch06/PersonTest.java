package ch06;

public class PersonTest {
	public static void main(String[] args) {
		// 1. ��� 3��(��ü 3��) �����
		Person p1 = new Person();
		Person p2 = new Person();
		Person p3 = new Person();
		
		// 2. �� ���(��ü)���� �̸�, ����, �ּҸ� �����ϼ���.
		// (�ڱ� �ڽ� �����ؼ� ����� ���� �ۼ��ϱ�)
		p1.name = "������";    p1.age = 19;    p1.addres = "��õ";
		p2.name = "������";    p2.age = 20;    p2.addres = "��õ";
		p3.name = "������";    p3.age = 21;    p3.addres = "����";
				
		// 3. Person Ŭ�������� ���� �޼��带 �� ���(��ü)���� ȣ���ϼ���.
		// for�� �̿��ص� ����, ���� 3�ٷ� ȣ���ص� �˴ϴ�.
		p1.aboutMe();
		p2.aboutMe();
		p3.aboutMe();
	}
}
