package ch04;

import java.util.Scanner;

public class Ch04Ex02_13 {
	public static void main(String[] args) {
		// 1. ��� ���� �Է¹޴´�.
		Scanner scanner = new Scanner(System.in);
		String[] numbers = scanner.nextLine().split(" ");
		int row = Integer.parseInt(numbers[0]);
		int col = Integer.parseInt(numbers[1]);
		
		// 2. �Է¹��� ��� ���� �̿��� Ʋ�� �����.
		for (int i = 1; i <= row; i++) {
			for (int j = 1; j <= col; j++) {
				System.out.print(j * i + " ");
			}
			System.out.println();
		}
	}
}
