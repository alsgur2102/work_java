package ch05;

import java.util.Scanner;

public class Ch05Ex01_01 {
	public static void main(String[] args) {
		// 1. ���� 10���� �����ϴ� �迭
		Scanner scanner = new Scanner(System.in);
		String[] alphabets = scanner.nextLine().split(" ");

		// 2. �Է¹��� ���ڿ� �迭�� ���� �迭�� ����
		char[] result = new char[alphabets.length];
		for (int i = 0; i < alphabets.length; i++) {
			// 2-1. alphabets String �迭�� ����ִ� ���ĺ� ���ڿ� �ϳ��� ������ ����.
			String tmp1 = alphabets[i];

			// 2-2. 1������ ������ �� ���ڿ��� char ������ �����Ѵ�.
			char tmp2 =	tmp1.charAt(0);

			// 2-3. 2������ char������ ������ ���� result �迭�� ����ִ´�.
			result[i] = tmp2;
		}
		
		// 3. ���ڵ��� ��� result �迭�� ����ִ� ���� ����ϱ�
		System.out.println(result); // char�� �迭�� for���� �̿����� �ʰ� �״�� �迭����
		           					// println �޼ҵ忡 �־��ֱ⸸ �ص� �迭������ ��µȴ�.
	}
}
