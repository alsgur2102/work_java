package ch03;

public class OperatorEx24 {
    public static void main(String[] args) {
		int x = 0;
		char ch = ' ';
		
		// x���� 10 �ʰ��̰� 20 �̸����� Ȯ��
		x = 15;
		System.out.printf("x=%2d, 10 < x && x < 20 =%b%n", x, 10 < x && x < 20);
		
		// ||(OR)�� �º��� true�� ��� �캯�� ������� �ʰ� true�� �����Ѵ�.
		x = 6;
		System.out.printf("x=%2d, x %%2 == 0 || x %% 3 == 0 && x %% 6 != 0 =%b%n", x, x % 2 == 0 || x % 3 == 0 && x % 6 != 0);
		
		// &&(AND)�� �º��� false�� ��� �캯�� ������� �ʰ� false�� �����Ѵ�.
		// ���⼭�� �º��� true�̱� ������ �캯���� Ȯ���ϰ� ����� �����ϰ� �ȴ�.
		System.out.printf("x=%2d, (x %%2 == 0 || x %% 3 == 0) && x %% 6 != 0 =%b%n", x, (x % 2 == 0 || x % 3 == 0) && x % 6 != 0);
		
		// ���� ch�� ���� '0'�̻� ���� '9' �������� Ȯ��
		ch = '1';
		System.out.printf("ch='%c', '0' <= ch && ch <= '9' =%b%n", ch, '0' <= ch && ch <= '9');
		
		// ���� ch�� ���� 'a'�̻� ���� 'z' �������� Ȯ��
		ch = 'a';
		System.out.printf("ch='%c', 'a' <= ch && ch <= 'z' =%b%n", ch, 'a' <= ch && ch <= 'z');
		
		// ���� ch�� ���� 'A'�̻� ���� 'z' �������� Ȯ��
		ch = 'A';
		System.out.printf("ch='%c', 'A' <= ch && ch <= 'z' =%b%n", ch, 'A' <= ch && ch <= 'z');
		
		// ���� ch�� ���� 'q'�̻� ���� 'Q'�̸� true
		ch = 'q';
		System.out.printf("ch='%c', ch == 'q' || ch == 'Q' =%b%n", ch, ch == 'q' || ch == 'Q');
	}
}
