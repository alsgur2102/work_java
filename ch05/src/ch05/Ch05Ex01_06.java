package ch05;

import java.util.Scanner;

public class Ch05Ex01_06 {
	public static void main(String[] args) {
		// 1. 10���� ������ �Է¹ޱ�
		Scanner scanner = new Scanner(System.in);
		String[] numbers = scanner.nextLine().split(" ");
		
		// 1-1. ��ü �迭�� �˻��ؼ� 1000 �̻��� ������ �߰ߵǸ� ���α׷� ����
		for (int i = 0; i < numbers.length; i++) {
			int num = Integer.parseInt(numbers[i]);
			
			// ���� 1000 �̻��� ������ �߰ߵǸ�
			if (num >= 1000) {
				// main �޼ҵ带 return ���� ���α׷� ����
				return;
			}
		}
		
		// 1-2. �迭�� ������ 10���� �ƴϸ� ���α׷� ����
		if (numbers.length != 10) {
			return;
		}
		
		// 2. ���� ���� ���� �����ϴ� ���� ����
		int min = Integer.parseInt(numbers[0]);
		
		// 3. numbers �迭���� ���ڿ� �ϳ��� ������ ����
		for (int i = 0; i < numbers.length; i++) {
			int num = Integer.parseInt(numbers[i]);
			
			min = min < num ? min : num;
		}
		
		// 4. ���� ���� ���� min ������ ���� �ǹǷ� min ������ ���
		System.out.println(min);
	}
}
