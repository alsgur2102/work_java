package ch04;

import java.util.Scanner;

public class Ch04Ex02_06 {
	public static void main(String[] args) {
		
		// 1. ���� ����� ����Ѵ�.
		System.out.println("1. Korea");
		System.out.println("2. USA");
		System.out.println("3. Japan");
		System.out.println("4. China");
		System.out.print("number? ");
		
		// 2. ���� ���� ��ȣ�� �Է¹޴´�.
		Scanner scanner = new Scanner(System.in);
		int num = Integer.parseInt(scanner.nextLine());
		
		// 3. �Է¹��� ��ȣ�� �̿��Ͽ� �ش� ������ ������ ���
		switch (num) {
		case 1:
			System.out.println("Seoul");
			break;
		case 2:
			System.out.println("Washington");
			break;
		case 3:
			System.out.println("Tokyo");
			break;
		case 4:
			System.out.println("Beijing");
			break;
		default:
			System.out.println("none");
		}
	}
}
