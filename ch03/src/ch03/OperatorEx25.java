package ch03;

import java.util.Scanner;  // Ctrl + Shift + 0 : �Է��ϸ� �ڵ� import �ȴ�.

public class OperatorEx25 {
    public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		char ch = ' ';
		
		System.out.printf("���ڸ� �ϳ� �Է��ϼ���.>");
		
		// ���ڿ��� �Է��ϰ� ����Ű�� �Է��ϱ� ������ 13������ ����
		String input = scanner.nextLine();
		
		// �Է¹��� ���ڿ����� 0��°�� �ش��ϴ� ���ڸ� �������.
		ch = input.charAt(0);
		
		// ������ �� ���ڰ� '0'�� '9' ���̿� ���ԵǴ��� Ȯ��
		if('0'<= ch && ch <= '9') {
			System.out.printf("�Է��Ͻ� ���ڴ� �����Դϴ�.%n");
		}
		
		// ������ �� ���ڰ� 'a'�� 'z' �����̰ų� 'A'�� 'Z' �������� Ȯ��
		if(('a'<= ch && ch <= 'z') || ('A'<= ch && ch <= 'z')) {
			System.out.printf("�Է��Ͻ� ���ڴ� �������Դϴ�.%n");
		}
	} // main
}
