package ch02;

import java.util.Scanner;

public class Ch02Ex02_08 {
    public static void main(String[] args) {
		// 2.2�� ����
    	
    	// 1. Scanner ��ü ����(System.in�� Ű����)
    	Scanner scanner = new Scanner(System.in);
    	
    	// 2. ��ĳ�ʸ� �̿��Ͽ� �Ǽ� 2���� �� ���� ���ڸ� ���ڿ��� �Է¹ޱ�
        String strNum1 = scanner.nextLine();
        String strNum2 = scanner.nextLine();
        String strChar = scanner.nextLine();
        
        // 3. �Է¹��� �Ǽ� 2���� �Ǽ�(double)������ ����
        // ��, ���ڴ� ���� ���ڷ� ������ �ʿ䰡 ����.
        double num1 = Double.parseDouble(strNum1);
        double num2 = Double.parseDouble(strNum2);
        
        // 4.printf() �̿��Ͽ� �Ǽ� 2���� ���� ���
        System.out.printf("%.2f%n", num1);
        System.out.printf("%.2f%n", num2);
        System.out.printf("%s", strChar);
	}
}
