package ch06;

public class PersonTest {
	public static void main(String[] args) {
		// 1. ��� 3��(��ü 3��) �����
		/*Person p1 = new Person();
		Person p2 = new Person();
		Person p3 = new Person();*/
		Person[] persons = new Person[3];

		// 2. �� ���(��ü)���� �̸�, ����, �ּҸ� �����ϼ���.
		// (�ڱ� �ڽ� �����ؼ� ����� ���� �ۼ��ϱ�)
		/*p1.name = "������";    p1.age = 19;    p1.address = "��õ";
		p2.name = "������";    p2.age = 20;    p2.address = "��õ";
		p3.name = "������";    p3.age = 21;    p3.address = "����";
		for (int i = 0; i < persons.length; i++) {
			persons[i] = new Person();
		}*/

		// [2-2] �Ʒ� ����� ��ü�� ���� �� �� �ν��Ͻ� ������ �����Ͽ�
		// ���� �ʱ�ȭ �� �κ��̴�.
		// �Ʒ� �κ��� 2-1���� �ۼ��� �����ڸ� �̿��Ͽ� �����Ͻÿ�.

		/*persons[0].name = "������";
		persons[0].age = 19;
		persons[0].address = "��õ";*/
		persons[0] = new Person("������", 19, "��õ");

		/*persons[1].name = "������";
		persons[1].age = 20;
		persons[1].address = "��õ";*/
		persons[1] = new Person("������", 20, "��õ");

		/*persons[2].name = "������";
		persons[2].age = 21;
		persons[2].address = "����";*/
		persons[2] = new Person("������", 21, "����");


		// 3. Person Ŭ�������� ���� �޼��带 �� ���(��ü)���� ȣ���ϼ���.
		// for�� �̿��ص� ����, ���� 3�ٷ� ȣ���ص� �˴ϴ�.
		/*p1.aboutMe();
		p2.aboutMe();
		p3.aboutMe();*/
		for (int i = 0; i < persons.length; i++) {
			persons[i].aboutMe();
		}
		
		// [2-4] 2-3���� ������ �����ڸ� �̿��Ͽ� "���"�̶�� �̸����� ��� ��ü �ϳ��� �����ϼ���.
		Person heungMin = new Person("���");

		// [2-5] 2-4 ��ü�� �̿��Ͽ� aboutMe() �޼��带 ȣ���ϼ���
		heungMin.aboutMe();
	}	
}
//}
