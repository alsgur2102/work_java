package ch06;

public class Person {
	// �Ӽ�(�ν��Ͻ� ����)
	// 1. �̸�
	String name;
	
	// 2. ����
	int age;
	
	// 3. �ּ�
	String address;
	
	// [2-1] �̸�, ����, �ּ� �ν��Ͻ� ������ �ʱ�ȭ�ϴ� �����ڸ� �ۼ��Ͻÿ�.
	Person(String name, int age, String address) {
		this.name = name;
		this.age = age;
		this.address = address;
	}
	
	// [2-3] �̸��� �Է¹޴� �����ڸ� �ۼ��Ͻÿ�.
	// ��, ���̿� �ּҰ��� ���� �⺻���� 19, "����" ������ �ʱ�ȭ�ϴ� �����ڸ� �ۼ��Ͻÿ�.
	// (��Ʈ: 2-1���� �ۼ��� �����ڸ� �̿��Ͽ� �����ڸ� �ۼ��ϸ� �˴ϴ�.)
	Person(String name) {
		/*this.name = name;
		this.age = 19;
		this.address = "����";*/
		this(name, 19, "����");  // ������ ù��° �ٿ� ȣ���ؾ� ��.
		System.out.println("������ ȣ��!");
	}
	
	// �ൿ(�޼���)
	// 1. �ڱ�Ұ�
	// "���� [����]�� [�ּ�]�� ��� [�̸�]�Դϴ�."
	void aboutMe() { System.out.println("���� " + age + "�� " + address + "�� ��� " + name + "�Դϴ�."); }  
}
