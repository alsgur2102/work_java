package ch02;

import java.util.Scanner;

public class ScannerEx�������� {
   public static void main(String[] args) {
		// 1. Scanner�� �̿��ؼ� 2�ڸ� ������ �Է¹�������.
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("���ڸ� ������ �Է����ּ���.>");
		//String input = scanner.nextLine();
		//int num = Integer.parseInt(input);    
		String input = scanner.nextLine();  
		int num = Integer.parseInt(input);  
		
		/* 2. �Է¹��� ������ println �޼ҵ带 �̿��ؼ�
		10����, 8����, 16������ ����ϼ���. */
		System.out.printf("10����=%d, 8����=%o, 16����=%x", num, num, num);
	}
}
