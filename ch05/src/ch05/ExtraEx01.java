package ch05;

public class ExtraEx01 {
	public static void main(String[] args) {
		// charAt() ����
		
		String a = "KOITT";
		String b = "APPLE";
		String c = "CAR";
		
		// 1. charAt()�� �̿��Ͽ� ���� result�� "KOREA"�� ��ƺ�����.
		char[] result = {a.charAt(0), a.charAt(1), c.charAt(2), b.charAt(4), c.charAt(1)}; 
		
		// 2. 1������ ���� "KOREA"�� ����غ�����.
		System.out.println(result);
	}
}
