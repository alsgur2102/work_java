package ch05;

import java.util.Scanner;

public class Ch05Ex01_04 {
	public static void main(String[] args) {
		// 2. 100���� ������ ������ �迭 ����
		int[] numbers = new int[100];

		for (int i = numbers.length - 1; i >= 0; i--) {
			// 1. �� �ٿ� �ϳ��� �Է¹ޱ�
			Scanner scanner = new Scanner(System.in);
			String num = scanner.nextLine();

			// 3. �Է¹��� ������ �迭�� ����
			numbers[i] = Integer.parseInt(num);

			// 4. ���� 0�� �Է¹����� �ݺ��� ����
			if (Integer.parseInt(num) == 0) {
				break;
			}
		}
		
		// 5. ���߿� �Էµ� �������� ���ʴ�� ���
		for (int i = 0; i < numbers.length; i++) {
			int tmp = numbers[i];
			if (tmp != 0) {
				System.out.print(tmp + " ");
			}
		}
	}
}
