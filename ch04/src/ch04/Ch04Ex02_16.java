package ch04;

import java.util.Scanner;

public class Ch04Ex02_16 {
	public static void main(String[] args) {
		// 1. �ڿ��� 1�� �Է¹ޱ�
		Scanner scanner = new Scanner(System.in);
		int num = Integer.parseInt(scanner.nextLine());

		// 2. �Է������� �˻�
		if (num > 6) {
			System.out.println("INPUT ERROR!");
			return; // Ư�� ���� ������ ��� ����ϴ� Ű����
			// ������ ���� Ÿ���� void �̹Ƿ� Ư�� ���� ���°��
			// main �޼ҵ带 �����ϸ� ���α׷� ����� ����.
		}

		// 3. ���� ���ﰢ������ ���
		char alphabet = 'A';
		int count = 0;
		for (int i = 0; i < num; i++) {
			for (int j = 0; j < num; j++) {
				int limit = num - i;
				if (j < limit) {
					System.out.print(alphabet +" ");
					alphabet++;
				}
				else {
					System.out.print(count + " ");
					count++;
				}
			}
			System.out.println();
		}
	}
}
