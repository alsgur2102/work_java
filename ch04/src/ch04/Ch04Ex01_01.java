package ch04;

import java.util.Scanner;

public class Ch04Ex01_01 {
	public static void main(String[] args) {
		// 1. ���� �Է� �ޱ�
		Scanner scanner = new Scanner(System.in);
		int num = Integer.parseInt(scanner.nextLine());
		
		// 2. ����̸� �Է¹��� ���ڸ� ���
		if (num > 0) {
			System.out.println(num);
		}	
		
		// 3. �����̸� �Է¹��� ���ڿ� "minus" ���ڿ� ���
		if (num < 0) {
			System.out.println(num);
			System.out.println("minus");
		}
	}
}
