package ch05;

import java.util.Scanner;

public class Ch05Ex02_11 {
	public static void main(String[] args) {
		// �ֻ����� ���� ���� ������ �Է¹ޱ�
		Scanner scanner = new Scanner(System.in);
		String[] numbers = scanner.nextLine().split(" ");
		
		// �ֻ����� ���� ���� ������ ������ �����ϴ� �迭
		// �ε��� 0������ 1~6���� ������ ����
		int[] counter = new int[6];
		
		// �Է¹��� �ֻ��� ������ �ϳ��� ������.
		for (int i = 0; i < numbers.length; i++) {
			// ���� ���ڿ��� ������ ��ȯ
			int num = Integer.parseInt(numbers[i]);
			
			// �ֻ��� ���� �� - 1 �� ���� �ε��� ��ȣ�� ��ġ
			// �ش� counter �迭 �ε����� 1 ����
			counter[num - 1]++;
		}
		
		// counter �迭 ���� ����ϱ�
		for (int i = 0; i < counter.length; i++) {
			// �ε��� ��ȣ + 1�� �ֻ��� ���� ����
			System.out.println(i + 1 + " : " + counter[i]);
		}
	}
}
