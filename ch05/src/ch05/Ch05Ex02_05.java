package ch05;

import java.util.Scanner;

public class Ch05Ex02_05 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String[] numbers = scanner.nextLine().split(" ");
		
		// ������ ������ ���� ���� �� �ʱ�ȭ
		double sum = 0;
		
		// �Է¹��� ������ �ϳ��� ������.
		for (int i = 0; i < numbers.length; i++) {
			// �迭�� ��� �� �ϳ��� ������ double ������ �����Ѵ�.
			// �� �� sum ������ ���Ѵ�.
			sum += Double.parseDouble(numbers[i]);
		}
		
		// ������ sum ���� ���̰�, �Է��� ���� ������ �迭�� ũ��� �� �� �����Ƿ�
		// ���տ��� �迭�� ũ�⸦ ������ ����� ���� �� �ִ�.
		System.out.printf("%.1%n", sum / numbers.length);
	}
}
