package ch04;

import java.util.Scanner;

public class Ex00 {
	public static void main(String[] args) {
		int num = 10;
		
		// ���� ����ŭ �ݺ�
		for (int i = 0; i < num; i++) {
		    // ���� ����ŭ �ݺ� 
			for (int j = 0; j < num; j++) {
				// ���� ���� ���� ��ĭ�� �ƴ� ���
				if (j >= num - i - 1) {
					System.out.print("*");
				}
				// �� �ܴ� ��ĭ�� ����̹Ƿ� ��ĭ ���
				else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
}	