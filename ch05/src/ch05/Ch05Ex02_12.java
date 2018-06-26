package ch05;

import java.util.Scanner;

public class Ch05Ex02_12 {
	public static void main(String[] args) {
		// 2-4 ���� ����
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
		// 2-4 ���� ���� ��
		
		// �����뺰 �л� ���� �����ϴ� �迭
		// 9�� �ε��� : 100���� �л�
		// 8�� �ε��� : 90���� �л�
		// 0�� �ε��� : 10���� �л�
		int[] counter = new int[10];
		
		// ���� i������ ���� �Է¹��� ����(0����)�� ������ ����.
		// 0������ �Է¹��� ���� �������� �ݺ�
		for (int j = 0; j < i; j++) {
			// ���� ������ ������ 10�� �� �� -1�� �ϸ� �ε��� ��ȣ�� ��ġ�Ѵ�.
			int index = numbers[j] / 10 - 1;
			
			// �ش� �ε����� ���� 1 ������Ų��.
			counter[index]++;
		}
		
		// ��� �������� 100������� ����ϹǷ�
		// �迭�� �ڿ������� ���ʴ�� ����ϸ� �ȴ�.
		for (int j = counter.length - 1; j >= 0; j --) {
			if (counter[j] != 0) {
				System.out.printf("%d : %d person%n", (j + 1) * 10, counter[j]);
			}
		}
	}
}
