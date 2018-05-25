package ch02;

import java.util.Scanner;

public class Ch02Ex02_03 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		String input = scanner.nextLine();
		String input1 = scanner.nextLine();
		
		int num = Integer.parseInt(input);
		int num1 = Integer.parseInt(input);
		
		System.out.printf("%d%n", num);
		System.out.printf("%d", num1);
	}		
}
