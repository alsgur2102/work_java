package test02;

public class ObjectTest3 {
	private int age;
	private String name;
	
	public ObjectTest3(int age, String name) {
		this.age = age;
		this.name = name;
	}
	
	public String toString() {
		return "�̸� : " + this.name + ", ���� : " + this.age;
	}
	public static void main(String[] args) {
		// �����ڸ� ����ؼ�
		// �̸� : ȫ�浿, ���� : 22
		// �̸� : �̱浿, ���� : 32
		// �̸� : ���浿, ���� : 42
		// ���� ��°��� �������� �ڵ����ּ���.
		System.out.println(new ObjectTest3(22, "ȫ�浿"));
		System.out.println(new ObjectTest3(32, "�̱浿"));
		System.out.println(new ObjectTest3(42, "���浿"));
	}
}
