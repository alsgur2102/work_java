package ch04;

import java.util.Scanner;

public class Ch04Ex02_17 {
	public static void main(String[] args) {
		// 1. �ڿ��� �ϳ� �Է¹ޱ�
		Scanner scanner = new Scanner(System.in);
		int num = Integer.parseInt(scanner.nextLine());

		// 3. ���ڸ� ����� ���� ���� �� �ʱ�ȭ
		int count = 1;

		// 2. Ʋ �ۼ�
		for (int i = 0; i < num; i++) {
			for (int j = 0; j < num; j++) {
				if (j >= i) {
					System.out.print((count % 10)+ " ");
					count++;
				}
				else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}
	}
}

