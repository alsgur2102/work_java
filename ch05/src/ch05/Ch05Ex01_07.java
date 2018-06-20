package ch05;

import java.util.Scanner;

public class Ch05Ex01_07 {
	public static void main(String[] args) {
		// 1. 10���� ������ �Է¹ޱ�
		Scanner scanner = new Scanner(System.in);
		String[] numbers = scanner.nextLine().split(" ");
		
		// 1-1. ��ü �迭�� �˻��ؼ� 1 �̻� 10,000 �̸��� ������ �߰ߵǸ� ���α׷� ����
		for (int i = 0; i < numbers.length; i++) {
			int num = Integer.parseInt(numbers[i]);
			
			// ���� 1000 �̻��� ������ �߰ߵǸ�
			if (!(1 <= num && num < 10000)) {
				// main �޼ҵ带 return ���� ���α׷� ����
				return;
			}
		}

		// 2. 100 �̸��� �� �� ���� ū ���� �����ϴ� ���� max ����
		int max = 100;

		// 3. 100 �̻��� �� �� ���� ���� ���� �����ϴ� ���� min ����
		int min = 100;

		// 4. numbers �迭�� ���� �ϳ��� �����鼭 ���ϱ�
		for (int i = 0; i <numbers.length; i++) {
			int num = Integer.parseInt(numbers[i]);

			if (num < 100) {
				if (max == 100) {
					max = num;
				}
				else {
					max = max > num ? max : num;
				}
			}
			else {
				if (min == 100) {
					min = num;
				}
				else {
					min = min < num ? min : num;
				}
			}
		}

		// 5. ����ϱ�
		System.out.println(max + " " + min); 
	}
}
