package ch04;

import java.util.Scanner;

public class Ch04Ex02_11 {
	public static void main(String[] args) {
		// 1. �ΰ��� ���� �Է¹ޱ�
		Scanner scanner = new Scanner(System.in);


		// 5. ������ �ݺ�
		while (true) {
			System.out.print("Base = ");
			int base = Integer.parseInt(scanner.nextLine());

			System.out.print("Height = ");
			int height = Integer.parseInt(scanner.nextLine());

			// 2. �Է¹��� ������ �̿��Ͽ� �ﰢ�� ���� ���
			System.out.printf("Triangle area = %.1f%n", base * height / 2.0);

			// 3. ��� �ݺ��� �������� �����
			System.out.print("Continue? ");

			// 4. ���ڿ� �Է¹ޱ�
			String answer = scanner.nextLine();
			
			// 6. Ư������("Y" Ȥ�� "y"�� �ƴҰ��)�� ��� �ݺ��� ����
			// equalsIgnoreCase() : ��ȣ ���� ���ڿ��� ��ҹ��� ��������
			// ������ ���� ���ٸ� true, �ƴϸ� false ����
			if (!answer.equalsIgnoreCase("Y")) {
				break;
			}
		}
	}
}
