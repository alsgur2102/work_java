package ch06;

class Person {
	// �Ӽ�(�ν��Ͻ� ����)
	// 1. �̸�
	String name;
	
	// 2. ����
	int age;
	
	// 3. �ּ�
	String addres;
	
	// �ൿ(�޼���)
	// 1. �ڱ�Ұ�
	// "���� [����]�� [�ּ�]�� ��� [�̸�]�Դϴ�."
	void aboutMe() { System.out.printf("���� " + age + "�� " + addres + "�� ��� " + name + "�Դϴ�."); }  
}
