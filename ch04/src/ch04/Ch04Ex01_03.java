package ch04;

import java.util.Scanner;

public class Ch04Ex01_03 {
	public static void main(String[] args) {
		// 1. ���� 1�� �Է¹ޱ�
		Scanner scanner = new Scanner(System.in);
		int years = Integer.parseInt(scanner.nextLine());
		
		// 2. 20�� �̻��̸� "adult" ���
		if (years > 20) {
			System.out.println("adult");
		} 
		// 3. �׷��� ������ �� ��� ������ �Ǵ��� ���
		else {
			int later = 20 - years;
			System.out.println(later + " years later");
		}
	}
}
