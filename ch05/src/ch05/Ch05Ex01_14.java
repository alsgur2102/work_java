package ch05;

import java.util.Scanner;

public class Ch05Ex01_14 {
	public static void main(String[] args) {
		// 1. �Է¹޾� ������ �迭 2�� ���� (2�� 4��)
		int[][] a1 = new int[2][4];
		int[][] a2 = new int[2][4];

		System.out.println("firsr array");
		// a1 �迭�� �Է¹��� ���� ����
		for (int j = 0; j < a1.length; j++) {
			// 2. ���� �Է¹ޱ�
			Scanner scanner = new Scanner(System.in);
			String[] numbers = scanner.nextLine().split(" ");

			// 3. �Է¹��� ������ a? �迭�� �����ϱ�
			for (int i = 0; i < numbers.length; i++) {
				a1[j][i] = Integer.parseInt(numbers[i]);
			}
		}
		
		System.out.println("second array");
		
		// a2 �迭�� �Է¹��� ���� ����
		for (int j = 0; j < a2.length; j++) {
			// 2. ���� �Է¹ޱ�
			Scanner scanner = new Scanner(System.in);
			String[] numbers = scanner.nextLine().split(" ");

			// 3. �Է¹��� ������ a? �迭�� �����ϱ�
			for (int i = 0; i < numbers.length; i++) {
				a2[j][i] = Integer.parseInt(numbers[i]);
			}
		}
		
		// 4. ����ϱ�
		for (int i = 0; i < a1.length; i++) {
			for (int j = 0; j < a1[i].length; j++) {
				System.out.print(a1[i][j] * a2[i][j] + " ");
			}
			System.out.println();
		}
	}
}