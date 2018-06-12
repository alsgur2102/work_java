
package ch04;

import java.util.Scanner;

public class Ch04Ex01_14 {
	public static void main(String[] args) {
		// 1. ���� �Է¹ޱ�
		Scanner scanner = new Scanner(System.in);
		int month = Integer.parseInt(scanner.nextLine());
		
		// 2. 1~12 ������ �������� Ȯ��
		if (1 <= month && month <= 12) {
			boolean isOdd = month % 2 != 0; // Ȧ���̸� true
			boolean is9OrLess = month <= 7; // 9�� �����̸� true
			boolean isOctDec = month == 8 || month == 12; // 10���̰ų� 12���̸� true
			
			if (isOdd && is9OrLess || isOctDec) {
				System.out.println(31);
			}
			else if (month == 2) {
				System.out.println(28);
			}
			else {
				System.out.println(30);
			}
		}
	}
}
