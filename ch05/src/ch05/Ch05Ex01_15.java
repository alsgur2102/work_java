package ch05;

import java.util.Scanner;

public class Ch05Ex01_15 {
	public static void main(String[] args) {
		// 1. �� ���� ������ ����� ������ �迭 ���� (5�� 5��)
		int[][] score = new int[5][5];

		// �� �л��� ������ �����ϴ� ����
		int sum = 0;

		for (int i = 0; i < 5; i++) {
			// 2. �� �л��� ���� �Է¹ޱ�
			Scanner scanner = new Scanner(System.in);
			String[] numbers = scanner.nextLine().split(" ");

			// 3. �Է¹��� ������ score �迭�� ������ �����ϱ�
			for (int j = 0; j < numbers.length; j++) {
				score[i][j] = Integer.parseInt(numbers[j]);
				sum += score[i][j];
			}
			
			// 4. ����� ����Ͽ� �迭�� ����
			score[i][4] = sum / 4;
			sum = 0;    // sum ���� ���� 0���� �ʱ�ȭ (�����л��� ������ ���ϱ� ����)
		}
		
		// 6. �հ��� ����� ���� �����ϴ� ����
		int count = 0;
		
		// 5. ��� ����ϱ�
		for (int i = 0; i < 5; i++) {
			if (score[i][4] >= 80) {
				System.out.println("pass");
				count++;
			}
			else {
				System.out.println("fail");
			}
		}
		
		System.out.println("Succesful : " + count);
	}
}
