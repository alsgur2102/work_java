package ch04;

import java.util.Scanner;

public class Ch04Ex02_02 {
	public static void main(String[] args) {
		// 1. ���� �ϳ� �Է¹ޱ�
		Scanner scanner = new Scanner(System.in);
		int num = Integer.parseInt(scanner.nextLine());
		
		int sum = 0;   // ������ ������ ����
		int i = 1;     // while���� �ݺ��Ҷ����� 1�� �����ϴ� ����
		
		while (i <= num) {
			sum += i; // sum = sum + i; i�� 1�� �����ϸ鼭 sum�� ����
			i++;      // i 1�� ����
		}
		
		System.out.println(sum);
	}
}
