package ch03;

import java.util.Scanner;

public class Ch03Ex01_03 {

	public static void main(String[] args) {
		// 1. �� ���� ������ �Է¹ޱ�
		Scanner scanner = new Scanner(System.in);
		String strNum1 = scanner.nextLine();
		String strNum2 = scanner.nextLine();
		int num1 = Integer.parseInt(strNum1);
    	int num2 = Integer.parseInt(strNum2);
    	
    	// 2. ���� ��ġ ���� �����ڿ� ��ġ ���� ������ ���
        int a = num1++;   // a���� num1�� 1�����ϱ� �� ���� �����
        int b = --num2;   // b���� num2�� 1���� �� ���� �����
    	int c = a * b;    // ���� �� ���� ���� �� ���� ���� �� ����
    	System.out.printf("%d %d %d", num1, num2, c);
  }
}	
