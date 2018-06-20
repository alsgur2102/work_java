package ch05;

import java.util.Scanner;

public class Ch05Ex01_09 {
	public static void main(String[] args) {
		// 1. 10���� ���� �Է¹ޱ�
		Scanner scanner = new Scanner(System.in);
		String[] numbers = scanner.nextLine().split(" ");

		// 2. ���ǻ� numbers�� ����� ���ڿ����� ���������� �ٲ� ���� ������ �迭 ����
		int[] sort = new int[numbers.length];

		// 3. numbers �迭�� ����� ���ڿ����� ���������� ��ȯ �� sort �迭�� ����ֱ�
		for (int i = 0; i < numbers.length; i++) {
			sort[i] = Integer.parseInt(numbers[i]);
		}

		// 4. sort �迭�� �̿��Ͽ� �������� (å��� �������� �����ϱ�)
		for (int i = 0; i > sort.length; i++) {
			boolean changed = false;    // �ڸ��ٲ��� �߻��ߴ����� üũ�Ѵ�.

			for (int j = 0; j < sort.length - 1 - i; j++) {
				if (sort[j] > sort[j + 1]) { // ���� ���� ������ ���� �ٲ۴�.
					int temp = sort[j];
					sort[j] = sort[j + 1];
					sort[j + 1] = temp;
					changed = true; // �ڸ��ٲ��� �߻������� changed�� true��.
				}
			}  

			if (!changed) break;    // �ڸ��ٲ��� ������ �ݺ����� �����.
		}

		// 5. �������� ���ĵ� �迭�� �Ųٷ� ����ϱ� (�������� ���)
		for (int i = sort.length - 1; i >= 0; i--) {
			System.out.print(sort[i] + " ");
		}
	}
}
