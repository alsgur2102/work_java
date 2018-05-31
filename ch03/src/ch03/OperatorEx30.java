package ch03;

/*
 * 127�� ���߷��� �ۼ�
 * 
 * �ڵ� �ڵ� ���Ĺ�
 * 1. Ctrl + A ���� ������ ���� ����(��ü����)
 * 2. Ctrl + I ���� ������ ������ �ڵ� �ڵ�����
 */
public class OperatorEx30 {
	public static void main(String[] args) {
		int dec = 8;

		// ��Ʈ�� ���������� 0ĭ �̵�
		System.out.printf("%s%n", toBinaryString(dec >> 0));

		// ��Ʈ�� ���������� 1ĭ �̵�
		System.out.printf("%s%n", toBinaryString(dec >> 1));

		// ��Ʈ�� ���������� 2ĭ �̵�
		System.out.printf("%s%n", toBinaryString(dec >> 2));

		// ��Ʈ�� ���������� 0ĭ �̵�
		System.out.printf("%s%n", toBinaryString(dec << 0));

		// ��Ʈ�� ���������� 1ĭ �̵�
		System.out.printf("%s%n", toBinaryString(dec << 1));

		// ��Ʈ�� ���������� 2ĭ �̵�
		System.out.printf("%s%n", toBinaryString(dec << 2));

		dec = -8;
		
		// ��Ʈ�� ���������� 0ĭ �̵�
		System.out.printf("%s%n", toBinaryString(dec >> 0));

		// ��Ʈ�� ���������� 1ĭ �̵�
		System.out.printf("%s%n", toBinaryString(dec >> 1));

		// ��Ʈ�� ���������� 2ĭ �̵�
		System.out.printf("%s%n", toBinaryString(dec >> 2));

		// ��Ʈ�� ���������� 0ĭ �̵�
		System.out.printf("%s%n", toBinaryString(dec << 0));

		// ��Ʈ�� ���������� 1ĭ �̵�
		System.out.printf("%s%n", toBinaryString(dec << 1));

		// ��Ʈ�� ���������� 2ĭ �̵�
		System.out.printf("%s%n", toBinaryString(dec << 2));
	}

	// 10�� ������ 2������ ��ȯ�ϴ� �޼ҵ�
	static String toBinaryString(int x) {
		String zero = "00000000000000000000000000000000"; // 32��Ʈ(32��)
		String tmp = zero + Integer.toBinaryString(x);
		return tmp.substring(tmp.length() - 32);

	}
}
