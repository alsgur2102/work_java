package ch03;

public class OperatorEx08 {
    public static void main(String[] args) {
		int a = 1_000_000;    // 1,000,000 1�鸸
		int b = 2_000_000;    // 2,000,000 2�鸸
		
		// ���Կ�����(=)�� �����ʺ��� ����� ���� �������� �����Ѵ�
		// int a, int b ���� �����  int Ÿ���̴�.
		// ���� ����� int ������ �ʰ��ϹǷ� �����÷ο찡 �Ͼ -1454759936 ������ ���� ���̴�.
		long c = a * b;       // a * b = 2,000,000,000,000 ?
		
		System.out.println(c);			
	}
}