package ch04;

import java.util.Scanner;

public class Ch04Ex02_03 {
	public static void main(String[] args) {
		
		// 4. ������ �ݺ��ϵ��� �ݺ��� �ۼ�
		while (true) {
			
			// 1. �Է� ���� ���
			System.out.print("������ �Է��ϼ���.(0:����) > ");

			// 2. ���� �ϳ� �Է¹ޱ�
			Scanner scanner = new Scanner(System.in);
			int num = Integer.parseInt(scanner.nextLine());

			// 3. ������� �������� �Ǵ��ϱ�
			if (num > 0) {
				System.out.println("postive integer");
			}
			else if (num < 0) {
				System.out.println("negative integer");
			}
			
			// 5. ���� ���� �����
			if (num == 0) {
				break;
			}
		}
	}
}
