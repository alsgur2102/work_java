package ch05;

import java.util.Scanner;

public class Ch05Ex02_13 {
	public static void main(String[] args) {
		// 1. �迭 ����(ù�װ� �ι�° �׸� �����ϴ� �迭 �켱 ����)
		int[] stream = new int[2];
		
		// 2. ù��°�װ� �ι�° ���� �Է¹��� ���� �ʱ�ȭ
		Scanner scanner = new Scanner(System.in);
		String[] numbers = scanner.nextLine().split(" ");
		
		// �Է¹��� ���� stream �迭 ù�װ� �ι�°�׿� ����
		stream[0] = Integer.parseInt(numbers[0]);
		stream[1] = Integer.parseInt(numbers[1]);
		
		// ù�װ� �ι�°�� ���� �׺��� �ݺ�����
		// ���������� �ִ� 10���� ����ϴ� ���α׷� �ۼ��϶�� �Ǿ� �����Ƿ�
		// 9�� �ε������� �ݺ�
		for (int i = 2; i < 10; i++) {
			// ���� �迭 ������ �����ϸ� �ø���
			if (i == stream.length) {
				int[] tmp = new int[stream.length * 2];
				System.arraycopy(stream, 0, tmp, 0, stream.length);
				stream = tmp;
			}
			
			// ������(i - 2)�� ����(i - 1)�� �տ��� 1�� �ڸ��� �迭�� ä���
			int result = (stream[i - 2] + stream[i - 1] % 10);
			stream[i] = result;
			
			// ���� 
			if (result < 0) {
				break;
			}
		}
		
		for (int i = 0; i < 10; i++) {
			System.out.print(stream[i] + " ");
			if (stream[i] < 0) {
				break;
			}
		}
	}
}
