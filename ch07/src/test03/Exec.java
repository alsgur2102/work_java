package test03;

import java.util.ArrayList;

public class Exec {

	public static void main(String[] args) {
		ArrayList<Person> pList = new ArrayList<Person>();
		for (int i = 0; i < 5; i++) {
			// �̸��� �׽�Ʈ1, �׽�Ʈ2... �׽�Ʈ5
			// ���̴� 10, 20... 50
			// ����Ʈ�� ������ �������
			String name = "�׽�Ʈ" + (i + 1);
			int age = (i + 1) * 10;
			Person p = new Person();
			p.setName(name);
			p.setAge(age);
			pList.add(p);
		}
		for (int i = 0; i < 5; i++) {
			Person p = pList.get(i);
			System.out.println(p.getName() + "," + p.getAge());
		}
	}
}