package ch04;

import java.util.Scanner;

public class Ch04Ex02_09 {	
	public static void main(String[] args) {
		// 2. �հ�� ���� ������ ������ �����ϴ� ����
		int sum = 0;
		int count = 0;

		while(true) {
			// 1. ���� 1�� �Է¹ޱ�
			Scanner scanner = new Scanner(System.in);
			int num = Integer.parseInt(scanner.nextLine());

			// 4. Ư�� ������ �����ϸ� while���� ������������ �Ѵ�.
			if (num > 100) {
				break;
			}
			
			// 3. �հ�� ī��Ʈ ���
			sum += num;
			count++;
		}	
		
		System.out.println("sum : " + sum);
		System.out.println("avg : " + (sum / (double)(count)));
	}
}
