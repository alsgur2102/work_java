package ch02;

import java.util.Scanner;

public class Ch02Ex02_13 {
    public static void main(String[] args) {
		// 1. Scanner ��ü ����(System.in�� Ű����)
    	Scanner scanner = new Scanner(System.in);
    	
    	// 2. ���� �� ���� ���ڿ��� �Է¹ޱ�
    	String strNum1 = scanner.nextLine();
    	String strNum2 = scanner.nextLine();
    	String strNum3 = scanner.nextLine();
    	
    	// 3. �Է¹��� ������ ����(int)������ �����ϱ�
    	int num1 = Integer.parseInt(strNum1);
    	int num2 = Integer.parseInt(strNum2);
    	int num3 = Integer.parseInt(strNum3);
    	
    	// 4. num1, num2, num3 ������ �̿��Ͽ� �հ� ��� ����ϱ�
    	int sum = num1 + num2 + num3;
    	int avg = sum / 3;
    	
    	// 5.  �� �������� �̿��Ͽ� ����ϱ�
    	System.out.printf("sum = %d%n", sum);
    	System.out.printf("avg = %d", avg);
	}
}
