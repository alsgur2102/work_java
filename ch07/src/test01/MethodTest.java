package test01;

public class MethodTest {
	String str = "abc";
	
	// ������Ÿ���� String
	// �Լ����� test()
	// 3���� ������ �Լ������� �����
	// ȣ�����ֽø� �˴ϴ�.
	String test() {
		return "abc";
	}
	String test(int a) {
		return a+"";
	}
	String test(double a) {
		return a+"";
	}
	public static void main(String[] args) {
		MethodTest mt1 = new MethodTest();
		System.out.println(mt1.test());
		System.out.println(mt1.test(1));
		System.out.println(mt1.test(1.1));
	}
}