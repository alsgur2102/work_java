package ch05;

import java.util.Scanner;

public class Ch05Ex01_11 {
	public static void main(String[] args) {
		// 1. ���� �ڸ� ������ ������ �����ϴ� �迭 ����
		int[] counter = new int[10];    // ���� �ڸ����� 0~9���� �̹Ƿ�

		// ���� �ݺ�
		while (true) {
			// 2. ���ٿ� �ϳ��� �Է¹ޱ�
			Scanner scanner = new Scanner(System.in);
			int num = Integer.parseInt(scanner.nextLine());

			// 4. 0�� �ԷµǸ� �ݺ��� ����
			if (num == 0) {
				break;
			}

			// 3. ���� �ڸ� �� ���ϱ�
			int ten = num / 10;
			counter[ten]++;
		}

		// 5. ��� ����ϱ�
		for (int i = 0; i < counter.length; i++) {
			if (counter[i] != 0) {
				System.out.printf("%d : %d%n", i, counter[i]);
			}
		}
	}
}
