package ch04;

import java.util.Scanner;

public class Ch04Ex01_13 {
	public static void main(String[] args) {
		// 1. "��ȣ�� �Է��ϼ���. > " ���� ���
		System.out.print("��ȣ�� �Է��ϼ���. > ");	
		
		// 2. ���� �Է¹ޱ�
		Scanner scanner = new Scanner(System.in);
		int menu = Integer.parseInt(scanner.nextLine());
		
		// 3. switch�� �̿��Ͽ� ��ȣ�� �ش��ϴ� ���� ����ϱ�
		switch (menu) {
		case 1:
			System.out.println("dog");
			break;
			
		case 2:
			System.out.println("cat");
			break;
			
		case 3:
			System.out.println("chick");
			break;
			
		default:
			System.out.println("I don't know.");	
		}
	}
}
