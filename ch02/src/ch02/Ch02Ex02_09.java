package ch02;

import java.util.Scanner;

public class Ch02Ex02_09 {
    public static void main(String[] args) {
		// 1. scanner ��ü ����(System.in�� Ű����)
    	Scanner scanner = new Scanner(System.in);
    	
    	// 2. �Ǽ�(float)�� 2���� �Ǽ�(double) �Ѱ��� ���ڿ��� �Է¹ޱ�
    	String strNum1 = scanner.nextLine();
    	String strNum2 = scanner.nextLine();
    	String strNum3 = scanner.nextLine();
    	
    	// 3. �Ǽ�(float)�� 2���� �Ǽ�(double) �Ѱ��� ���� float�� double������ ����
    	float num1 = Float.parseFloat(strNum1);
    	float num2 = Float.parseFloat(strNum2);
    	double num3 = Float.parseFloat(strNum3);
    	
    	// 4. �� �������� �Ҽ��� 3° �ڸ����� ����ϱ�
    	System.out.printf("%.3f%n", num1);
    	System.out.printf("%.3f%n", num2);
    	System.out.printf("%.3f", num3);
    }
}
