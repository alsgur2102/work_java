package ch05;

import java.util.Scanner;

public class Ch05Ex02_03 {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		String[] numbers = scanner.nextLine().split(" ");

		// Ȧ����° �հ� ¦����° ���� ������ ���� ���� �� �ʱ�ȭ
		int odd = 0;
		int even = 0;

		// numbers �迭���� ���� �ϳ��� ������.
		for (int i = 0; i < numbers.length; i++) {
			if (i % 2 == 0) {
				// Ȧ����° ���� �����ϴ� ������ ���ϱ�
				odd += Integer.parseInt(numbers[i]);
			}
			// ���� ¦����° ���̸�
			else {
				// ¦����° ���� �����ϴ� ������ ���ϱ�
				even += Integer.parseInt(numbers[i]);
			}
		}
		
		// Ȧ����°�� ¦����° ������ ���� ����ϱ�
		System.out.println("odd : " + odd);
		System.out.println("even : " + even);
	}
}

