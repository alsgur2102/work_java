package ch05;

import java.util.Scanner;

public class Ch05Ex01_03 {
	public static void main(String[] args) {	
		// 1. ���η� �Է¹ޱ�
		Scanner scanner = new Scanner(System.in);
		String[] alphabets = scanner.nextLine().split(" ");
		
		// 2. ù ��° ���� ���
		System.out.print(alphabets[0] + " ");
		
		// 3. �� ��° ���� ���
		System.out.print(alphabets[3] + " ");
		
		// 4. �ϰ� ��° ���� ���
		System.out.print(alphabets[6]);
	}
}


