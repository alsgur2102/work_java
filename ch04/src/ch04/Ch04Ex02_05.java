package ch04;

import java.util.Scanner;

public class Ch04Ex02_05 {
	public static void main(String[] args) {
		
		// 3. Ư�� ������ �����ϱ� ������ ������ �ݺ��Ѵ�.
		while(true) {
			// 1. ���� �Ѱ��� �Է¹޴´�.
			Scanner scanner = new Scanner(System.in);
			int num = Integer.parseInt(scanner.nextLine());

			// 2. 3�� ����� ��쿡�� 3���� ���� ���� ����Ѵ�.
			if (num % 3 == 0) {
				System.out.println(num / 3);
			}
			
			// 4. -1�� �ԷµǸ� ����
			if (num == -1) {
				break;
			}
		}
	}
}
