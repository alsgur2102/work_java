package ch04;

import java.util.Scanner;

public class Ch04Ex02_10 {
	public static void main(String[] args) {
		// 1. 3�� ����� 5�� �豸�� �ƴ� ���� ������ �����ϴ� ���� ���� �� �ʱ�ȭ
		int count = 0;

		// 4. ������ �ݺ�
		while (true) {
			// 2. ���� 1�� �Է¹ޱ�
			Scanner scanner = new Scanner(System.in);
			int num = Integer.parseInt(scanner.nextLine());

			// 3. �Է¹��� ���� 3�� ������� 5�� ������� Ȯ�� �� �ƴϸ� count 1 ����
			if (!(num % 3 == 0 || num % 5 == 0)) {
				count++;
			}
			
			// 5. Ư�� ������ ��� while�� ����
			if (num == 0) {
				break;
			}
		}
		
		System.out.println(count);
	}
}
