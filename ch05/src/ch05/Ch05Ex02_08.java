package ch05;

import java.util.Scanner;

public class Ch05Ex02_08 {
	public static void main(String[] args) {
		
		// 2-4�� ���� ����
		int[] numbers = new int[2];
		
		int i = 0;
		while (true) {
			Scanner scanner = new Scanner(System.in);
			int num = Integer.parseInt(scanner.nextLine());
			
			if (i == numbers.length) {
				int[] tmp = new int[numbers.length * 2];
				System.arraycopy(numbers, 0, tmp, 0, numbers.length);
				numbers = tmp;
			}
			
			numbers[i] = num;
			if (numbers[i] == 0) {
				break;
			}
			
			i++;
		}
		// 2-4�� ���� ���� ��
		
		// 5�� ��� ������ �����ϴ� ����
		int multiplesOfFive = 0;
		
		// 5�� ��� �հ踦 �����ϴ� ����
		int sum = 0;
		
		// numbers �迭�� ó������ Ž���Ѵ�.
		for (int j = 0; j < numbers.length; j++) {
			// ���� 0�� ������ �Ǹ� �ݺ��� ����
			if (numbers[i] == 0) {
				break;
			}
			
			// ���� 5�� ������
			if (numbers[j] % 5 == 0) {
				// 5�� ��� ������ �����ϴ� ���� 1����
				multiplesOfFive++;
				
				// ������ �����ϴ� ������ �� ����
				sum += numbers[j];
			}
		}
		
		// ��� ���
		System.out.println("Multiples of 5 : " + multiplesOfFive);
		System.out.println("sum : " + sum);
		System.out.printf("avg : %.1f%n", sum / (double)multiplesOfFive);
	}
}
