package ch05;

import java.util.Scanner;

public class Ch05Ex01_12 {
	public static void main(String[] args) {
		// 1. �迭 ����(ù�װ� �ι�° �׸� �����ϴ� �迭 �켱 ����)
		int[] stream = new int[2];
		
		// 2. ù��°���� 100���� �ι�° ���� �Է¹��� ���� �ʱ�ȭ
		stream[0] = 100;
		
		Scanner scanner = new Scanner(System.in);
		stream[1] = Integer.parseInt(scanner.nextLine());
		
		for (int i = 2; i <= stream.length ; i++) {
			// �迭�� �� á�� ���
			if (i == stream.length) {
				int[] tmp = new int[stream.length * 2]; // ���� �迭�� 2�� ũ��� �����.
				System.arraycopy(stream, 0, tmp, 0, stream.length);
				stream = tmp;
			}
			
			int result = stream[i - 2] - stream[i - 1];
			stream[i] = result;
			
			if (result < 0) {
				break;
			}
		}
		
		for (int i = 0; i < stream.length; i++) {
			System.out.print(stream[i] + " ");
			if (stream[i] < 0) {
				break;
			}
		}
	}
}
