package ch04;

import java.util.Scanner;

public class Ch04Ex01_07 {
	public static void main(String[] args) {
		// 1. ���ڿ� �ϳ��� �Է¹޴´�.
		Scanner scanner = new Scanner(System.in);
		char grade = scanner.nextLine().charAt(0);
		// 2. switch���� �̿��Ͽ� ��޿� �´� ���ڿ� ���
		switch (grade) {
		case 'A':
			System.out.println("Excellent");
			break;
			
		case 'B':
			System.out.println("Good");
			break;
		
		case 'C':
			System.out.println("Usually");
			break;
			
		case 'D':
			System.out.println("Effort");
			break;
			
		case 'F':
			System.out.println("Failure");
			break;
			
		default:
			System.out.println("error");
				
		}
	}
}
