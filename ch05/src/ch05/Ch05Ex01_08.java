package ch05;

import java.util.Scanner;

public class Ch05Ex01_08 {
	public static void main(String[] args) {
		// 1. 10���� ���� �Է¹ޱ�
		Scanner scanner = new Scanner(System.in);
		String[] numbers = scanner.nextLine().split(" ");
		
		// 1-1. ¦�� ��° �Էµ� ���� ���� �����ϴ� ���� ���� �� �ʱ�ȭ
		int sum = 0;
		
		// 1-2. Ȧ�� ��° �Էµ� ���� ����� �����ϴ� ���� ���� �� �ʱ�ȭ
		int avg = 0;
		int count = 0;  // Ȧ�� ��° �Էµ� ���� ����
		
		// 2. �迭 ��ü�� Ž���Ѵ�.
		for (int i = 0; i < numbers.length; i++) {
			// Ȧ�� ��° �Էµ� ���� ���
			if (i % 2 == 0) {
				avg += Integer.parseInt(numbers[i]);
				count++;
			}
			// ¦�� ��° �Էµ� ���� ���
			else { 
				sum += Integer.parseInt(numbers[i]);
			}
		}
		
		// 3. ��� ����ϱ�
		System.out.printf("sum : %d%n", sum);
		System.out.printf("avg : %.1f%n", avg / (double)count);
	}
}
