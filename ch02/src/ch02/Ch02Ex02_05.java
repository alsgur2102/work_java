package ch02;

import java.util.Scanner;

public class Ch02Ex02_05 {

	public static void main(String[] args) {
        // 1. Scanner ��ü ����(System.in�� Ű����)
		Scanner scanner = new Scanner(System.in);
        
		// 2. �ϳ��� ������ �ϳ��� �Ǽ��� ���ڿ��� �Է¹ޱ�
        String strnum1 = scanner.nextLine();
		String strnum2 = scanner.nextLine();
		
		// 3. �Է¹��� �� ���ڿ��� ���� ����(int)�� �Ǽ�(float)�� �����ϱ�
		int num1 = Integer.parseInt(strnum1);
		float num2 = Float.parseFloat(strnum2);
		
		// 4. num1, num2 ������ �̿��Ͽ� ����ϱ�
		float result = num1 * num2;
		
		// 5. num1, num2, result ������ �̿��Ͽ� ����ϱ�
		System.out.printf("%d * %f = %f", num1, num2, result);
	}	
}
