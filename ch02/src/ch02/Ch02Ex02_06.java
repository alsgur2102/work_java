package ch02;

import java.util.Scanner;

public class Ch02Ex02_06 {

	public static void main(String[] args) {
		// 1. Scanner ��ü ����(System.in)
		Scanner scanner = new Scanner(System.in);
		
		// 2. �Ǽ� 2���� ���ڿ��� �Է¹ޱ�
		String strNum1 = scanner.nextLine();
		String strNum2 = scanner.nextLine();
		
		// 3. �Է¹��� �Ǽ� 2���� �Ǽ�(double)������ �����ϱ�
		double num1 = Double.parseDouble(strNum1);
		double num2 = Double.parseDouble(strNum2);
		
		// 4. num1�� num2 ������ �̿��Ͽ� ����ϱ�
		double fromYard = num1 * 91.44;
		double fromInch = num2 * 2.54;
		
		// 5. ������ �����ߴ� �������� �̿��Ͽ� ����ϱ�
		System.out.printf("%4.1fyd = %5.1fcm%n", num1, fromYard);
		System.out.printf("%4.1fin = %5.1fcm", num2, fromInch);
	}
}
