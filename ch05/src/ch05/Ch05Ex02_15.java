package ch05;

import java.util.Scanner;

public class Ch05Ex02_15 {
	public static void main(String[] args) {
		// �������� �� ������ �����ϴ� �迭 score
		// ���� ���� ���ϰ�, ���� ��� ���� ���Ѵ�.
		int[][] score = new int[4][3];

		// �� �ݿ��� ���� �� Ƚ���� score �迭�� �����Ѵ�.
		for (int i = 0; i < score.length; i++) {
			// 1. �Է� ���� ���� ���� ���
			System.out.printf("%dclass? ", i + 1);

			// 2. ����� �����Ͽ� �� ���� ���� �� Ƚ���� �Է¹޴´�.
			Scanner scanner = new Scanner(System.in);
			String[] numbers = scanner.nextLine().split(" ");

			// 3. score �迭�� �� �ε��� ��ȣ�� numbers �迭�� �ε��� ��ȣ�� ��ġ�Ѵ�.
			for (int j = 0; j < score[i].length; j++) {
				score[i][j] = Integer.parseInt(numbers[j]);
			}
		}

		// score �迭�� ����� ���� �� Ƚ���� �̿��Ͽ� �� �ݺ� ������ ����Ѵ�.
		for (int i = 0; i < score.length; i++) {
			int sum = 0;
			for (int j = 0; j < score[i].length; j++) {
				sum += score[i][j];
			}
			System.out.printf("%dclass : %d%n", i + 1, sum);
		}
	}
}
