package ch02;

import java.util.Scanner;

public class Ch02Ex02_14 {
    public static void main(String[] args) {
		// 1. Scanner ��ü ����(System.in�� Ű����)
    	Scanner scanner = new Scanner(System.in);
    	
    	// 1-1. yard�� �Է��϶�� �ȳ� ���� ����ϱ�
    	System.out.print("yard? ");
    	
    	// 2. �Ǽ� �ϳ��� ���ڿ��� �Է¹ޱ�
    	String strNum1 = scanner.nextLine();
    	
    	// 3. �Է¹��� �Ǽ��� �Ǽ�(double)������ �����ϱ�
    	double num1 = Double.parseDouble(strNum1);
    	
    	// 4. num1 ������ �̿��Ͽ� ����ϱ�
    	double result = num1 * 91.44;
    	
    	// 5. �� �������� �̿��Ͽ� ����ϱ�
    	System.out.printf("%.1fyard = %.1fcm", num1, result);
	}
}
