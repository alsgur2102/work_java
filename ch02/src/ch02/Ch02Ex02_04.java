package ch02;

import java.util.Scanner;

public class Ch02Ex02_04 {

	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
		// 1. ���� 2�� �Է¹ޱ�
		String input = scanner.nextLine();
		String input1 = scanner.nextLine();
		String input2 = scanner.nextLine();
		String input3 = scanner.nextLine();
		// 2. �Է¹��� ���� 2�� ������ ����
		int num = Integer.parseInt(input);
		int num1 = Integer.parseInt(input1);
		int num2 = Integer.parseInt(input2);
		int num3 = Integer.parseInt(input3);
		// 3. num - num1 = ����� ���� ��µǵ��� �ۼ�
		System.out.printf("%d - %d = %d%n", num, num1, num - num1);
		System.out.printf("%d - %d = %d", num2, num3, num2 - num3);
	}
}
