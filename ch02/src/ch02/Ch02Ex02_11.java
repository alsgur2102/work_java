package ch02;

import java.util.Scanner;

public class Ch02Ex02_11 {
    public static void main(String[] args) {
		// 1. Scanner ��ü ����(System.in�� Ű����)
    	Scanner scanner = new Scanner(System.in);
    	
    	// 2. �Ǽ� �� ���� ���ڿ��� �Է¹ޱ�
    	String strNum1 = scanner.nextLine();
    	String strNum2 = scanner.nextLine();
    	
    	// 3. �Է¹��� �� �Ǽ��� �Ǽ�(double)������ �����ϱ�
    	double num1 = Double.parseDouble(strNum1);
    	double num2 = Double.parseDouble(strNum2);
    	
    	// 4. num1, num2 ������ �̿��Ͽ� ����ϱ�
    	double result = num1 + num2;
    	
    	// 5. printf()�� �̿��Ͽ� ����ϱ�
    	System.out.printf("%10.2f%10.2f%10.2f", num1, num2, result);
	}
}
