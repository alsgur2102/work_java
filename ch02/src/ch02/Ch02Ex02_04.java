package ch02;

import java.util.Scanner;

public class Ch02Ex02_04 {

	public static void main(String[] args) {
		// 2.3�� ����
		
		// 1. Scanner ��ü ����(System.in�� Ű����)
		Scanner scanner = new Scanner(System.in);
		
        // 2. ���� 2���� ���ڿ��� �Է¹ޱ�
		String strNum1 = scanner.nextLine();
		String strNum2 = scanner.nextLine();
		
		// 3. �Է¹��� ���� 2���� ����(int)������ �����ϱ�
		int num1= Integer.parseInt(strNum1);
		int num2 = Integer.parseInt(strNum2);
	
		// 4. ���������� ������ �� �� ���� num1�� num2�� �̿��Ͽ� ���
		int result = num1 - num2;
		
		// 5. num1, num2, result�� ���
		System.out.printf("%d - %d = %d%n", num1, num2, result); 
	}
}
