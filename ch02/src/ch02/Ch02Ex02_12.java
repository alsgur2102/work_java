package ch02;

import java.util.Scanner;

public class Ch02Ex02_12 {
    public static void main(String[] args) {
		// 1.Scanner ��ü ����(System.in�� Ű����)
    	Scanner scanner = new Scanner(System.in);
    	
    	// 2. ���� �ϳ��� �Ǽ� �ϳ��� ���ڿ��� �Է¹ޱ�
    	String strNum1 = scanner.nextLine();
    	String strNum2 = scanner.nextLine();
    	
    	// 3. �Է¹��� ���� ����(int)��, �Ǽ�(double)������ �����ϱ�
    	int num1 = Integer.parseInt(strNum1);
    	double num2 = Double.parseDouble(strNum2);
    	
    	// 4. num1, num2 ������ �̿��Ͽ� ����ϱ�
    	double result = num1 * num2;
    	
    	// 5. �� �������� �̿��Ͽ� ����ϱ�
    	System.out.printf("%.2f * %d = %.0f", num2, num1, result);
	}
}
