package ch04;

import java.util.Scanner;

public class Ch04Ex02_04 {
	public static void main(String[] args) {
		// 3. �ݺ������� ��������� ������ ����ϱ� ���� �ݺ��� �ٱ��ʿ� ������ ����
		int sum = 0;    // ������ �����ϴ� ����
		int count = 0;  // ���� ���� ���� ����
		
		// 2. Ư�� ������ �����ϱ� ������ ������ �ݺ��ϱ�
		while (true) {
			// 1. ���� �Է¹ޱ�
			Scanner scanner = new Scanner(System.in);
			int num = Integer.parseInt(scanner.nextLine());
			
			// 4. �Է¹��� ���� ���ϱ�
			sum += num;
			
			// 5. count ����
			count++;
			
			// 6. 100 �̻��� ���� �ԷµǸ� �ݺ��� ����
			if (num >= 100) {
				break;
			}
		}
		
		// 7. ��� ���
		System.out.printf("%d%n%.1f", sum, (double)sum / count);
	}
}	
