package ch05;

import java.util.Scanner;

public class Ch05Ex01_10 {
	public static void main(String[] args) {
		// 0. �빮���� ������ ������ �迭 ����
		int[] counter = new int[26];

		// 4. ���� �ݺ�
		while (true) {
			// 1. ���ٿ� �ϳ��� �Է¹ޱ�
			Scanner scanner = new Scanner(System.in);
			char ch = scanner.nextLine().charAt(0);

			// 2. 1������ �Է¹��� ���ڸ� �˻��Ͽ� ���� ����
			if ('A' <= ch && ch <= 'Z') {
				counter[ch - 'A']++;
			}
			// 5. �ݺ����� �������� ���ǹ� �ۼ�
			else {
				break;
			}
		}

		// 3. �빮�� ������ ������ �迭 ����ϱ�
		for (int i = 0; i < counter.length; i++) {
			if (counter[i] != 0) {
				System.out.printf("%c : %d%n", i + 'A', counter[i]);
			}
		}
	}
}
