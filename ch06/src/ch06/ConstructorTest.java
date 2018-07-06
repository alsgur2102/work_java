package ch06;

class Data01 {
	int value;
	
	/*
	 * �⺻ ������(Default Constructor)
	 * �����ڸ� �ۼ����� ������ �⺻����
	 * �����Ϸ��� �˾Ƽ� �����ϴ� ������
	 * ���� �Ʒ��� ���� ��������� �ۼ� ��
	 * �ٵ�κ�(�߰�ȣ ��)�� �ڵ带 �ۼ��ϸ� 
	 * ������ ȣ�� �� �ڵ尡 ������ �ȴ�.
	 */
	Data01() {
		
	}
}

class Data02 {
	int value;
	
	/*
	 * ������
	 * �ν��Ͻ��� ������ �� ȣ��Ǵ� �ν��Ͻ� �ʱ�ȭ �޼����̴�.
	 * 
	 * 1. �������� �̸��� Ŭ������ �̸��� ���ƾ� �Ѵ�.
	 * 2. �����ڴ� ���� ���� ����.
	 * 
	 * �����ڴ� ��ü�� �����Ǵ� ������ 
	 * �����ϰ� ���� �ڵ带 �ۼ��ϸ� �ȴ�.
	 * ��) �ν��Ͻ� ���� ���� ���ϴ� ������ �ʱ�ȭ �� ��
	 */
	
	Data02(int x) {  // �Ű������� �ִ� ������.
		value = x;
		System.out.println("Data2 ������ ȣ��!");
	}
}

class ConstructorTest {
	public static void main(String[] args) {
		Data01 d1 = new Data01();
		Data02 d2 = new Data02(30); // compile error�߻�
		
		System.out.println("d1 ��ü�� value: " + d1.value);
		System.out.println("d2 ��ü�� value: " + d2.value);
	}
}
