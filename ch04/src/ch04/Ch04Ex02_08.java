package ch04;

import java.util.Scanner;

public class Ch04Ex02_08 {
	public static void main(String[] args) {

		// 2. Ȧ�� ������ �����ϴ� ������ ¦�� ������ �����ϴ� ���� ���� �� �ʱ�ȭ
		// 6. while�� �ȿ� ����� �������� while�� �ٱ����� ����� �� �����Ƿ�
		//    �Ʒ��� ���� while�� �ٱ����� ��������.
		int odd = 0;
		int even = 0;

		// 5. Ư�� ������ �����ϱ� ������ ������ �ݺ� 
		while (true) {
			// 1. ���� �Ѱ� �Է¹ޱ�
			Scanner scanner = new Scanner(System.in);
			int num = Integer.parseInt(scanner.nextLine());

			// 3. Ȧ���̸� odd ���� 1 ����, ¦���̸� even ���� 1 ����
			// Ȧ���̸�
			if (num % 2 != 0) {
				odd++;
			}
			// ¦���̸�
			else {
				if (num != 0) {
					even++;
				}
			}
			

			// 7. Ư������ (0 �Է�)�� �Ǿ��� �� while�� ����
			if (num == 0) {
				break;
			}
		}
		// 4. Ȧ���� ¦���� ���� ���
		System.out.println("odd : " + odd);
		System.out.println("even : " + even);

	}

}


