package ch02;

import java.util.Scanner;

public class Ch02Ex02_03 {

	public static void main(String[] args) {
		// 2.2�� ���� ����
		
		// 1. Scanner ��ü ����(System.in�� Ű����)
		Scanner scanner = new Scanner(System.in);
		
		// 2. ���� 2���� ���ڿ��� �Է¹ޱ�(nextLine() �ι� ȣ��)
		String strNum1 = scanner.nextLine();
		String strNum2 = scanner.nextLine();
		
		// 3. �Է¹��� ���ڿ� 2���� ����(int)������ ����
		int num1 = Integer.parseInt(strNum1);
		int num2 = Integer.parseInt(strNum2);
		
		System.out.printf("%d%n", num1);
		System.out.printf("%d%n", num2);
	}		
}
