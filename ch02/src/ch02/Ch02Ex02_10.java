package ch02;

import java.util.Scanner;

public class Ch02Ex02_10 {
    public static void main(String[] args) {
	    // 1. Scanner ��ü ���� (System.im�� Ű����)
    	Scanner scanner = new Scanner(System.in);
    	
    	// 2. �� ���� ������ ���ڿ��� �Է¹ޱ�
    	String strNum1 = scanner.nextLine();
    	String strNum2 = scanner.nextLine();
    	
    	// 3. �� ���� ������ ����(int)������ �����ϱ�
    	int num1 = Integer.parseInt(strNum1);
    	int num2 = Integer.parseInt(strNum2);
    	
    	// 4. num1�� num2�� �̿��Ͽ� ����ϱ�
    	int result = num1 + num2;
    	
    	// 5. num1, num2, result ������ �̿��Ͽ� ����ϱ�
    	System.out.printf("%d + %d = %d", num1, num2, result);
    }
}
