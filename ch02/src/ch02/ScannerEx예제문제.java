package ch02;

import java.util.Scanner;

public class ScannerEx예제문제 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("두자리 정수를 입력해주세요.>");
		String input = scanner.nextLine();
		int num = Integer.parseInt(input);
		
		System.out.println("입력내용 : " + input);
		System.out.printf("num=%d%n", num);
		System.out.printf("num=%o%n", num);
		System.out.printf("num=%x%n", num);
	}
}
