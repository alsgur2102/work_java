package ch04;

import java.util.Scanner;

public class Ch04Ex02_14 {
	public static void main(String[] args) {
		// 1. �ΰ��� ���� �Է¹ޱ�
		Scanner scanner = new Scanner(System.in);
		String[] numbers = scanner.nextLine().split(" ");
		int num01 = Integer.parseInt(numbers[0]);
		int num02 = Integer.parseInt(numbers[1]);

		// 2. �ܼ��ϰ� �ڵ带 �� �κ����� ������
		// 2. 1. ù��° ���� �۰� �ι�° ���� Ŭ ���
		if (num01 < num02) {
			// 3. Ʋ �ۼ�
			for (int i = 1; i <= 9; i++) {
				for (int j = num01; j <= num02; j++) {
					System.out.printf("%d * %d =%3d   ", j, i, j * i);
				}
				System.out.println();
			}
		}
		// 2.2. ù��° ���� ũ�� �ι�° ���� ���� ���
		else if (num01 > num02) {
			// 3. Ʋ �ۼ�
			for (int i = 1; i <= 9; i++) {
				for (int j = num01; j >= num02; j--) {
					System.out.printf("%d * %d =%3d   ", j, i, j * i);
				}
				System.out.println();
			}
		}
	}
}
