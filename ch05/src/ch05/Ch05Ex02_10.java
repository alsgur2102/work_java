package ch05;

import java.util.Scanner;

public class Ch05Ex02_10 {
	public static void main(String[] args) {
		// ����� ���� �Է¹ޱ�
		Scanner scanner = new Scanner(System.in);
		int count = Integer.parseInt(scanner.nextLine());
		
		// �Է¹��� ����� ���� 20 �ʰ��� ���� ���α׷� ����
		if (count > 20) {
			return;
		}
		
		// �Է¹��� ����� ���� �̿��Ͽ� ������ ������ �迭 ����
		int[] score = new int[count];
		
		// �������� �Է¹ޱ�
		String[] tmp = scanner.nextLine().split(" ");
		
		// tmp �迭�� Ÿ���� String�̹Ƿ� int������ �����Ͽ� score �迭�� �����Ѵ�.
		for (int i = 0; i < tmp.length; i++) {
			score[i] = Integer.parseInt(tmp[i]);
		}
		
		// ArrayEx10 ���� ���� (�������� - Bubble Sort)
		for (int i = 0; i < score.length - 1; i++) {
			boolean changed = false;
			
			for (int j = 0; j < score.length - 1 - i; j++) {
				if (score[j] > score[j + 1]) {
					int temp = score[j];
					score[j] = score[j + 1];
					score[j + 1] = temp;
					changed = true;
				}
			}
			
			if (!changed) break;
		}
		
		// ���������� ������ ������������ ���ĵǱ� ������ �迭�� �ڿ������� ����ϸ�
		// �������� (������ ���� ����)���� ��µȴ�.
		for (int i = score.length - 1; i >= 0; i--) {
			System.out.println(score[i]);
		}
	}
}
