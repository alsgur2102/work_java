package ch02;

import java.util.Scanner;

public class Ch02Ex02_02 {

	public static void main(String[] args) {
		// 1. Scanner ��ü ����(System.in�� Ű����)
		Scanner scanner = new Scanner(System.in);
		
		// 2. ��ĳ�ʸ� �̿��Ͽ� ���� �ϳ� �Է¹ޱ�
		String strNum = scanner.nextLine();
		
		// 3. ���ڿ��� �Է¹��� ���� ����(int)������ ����
		int num = Integer.parseInt(strNum);
		
		// 4. ���� num ���
		System.out.printf("%d", num);
	}
}
