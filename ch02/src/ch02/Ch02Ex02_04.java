package ch02;

import java.util.Scanner;

public class Ch02Ex02_04 {

	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
		// 1. 숫자 2개 입력받기
		String input = scanner.nextLine();
		String input1 = scanner.nextLine();
		String input2 = scanner.nextLine();
		String input3 = scanner.nextLine();
		// 2. 입력받은 숫자 2개 변수에 저장
		int num = Integer.parseInt(input);
		int num1 = Integer.parseInt(input1);
		int num2 = Integer.parseInt(input2);
		int num3 = Integer.parseInt(input3);
		// 3. num - num1 = 계산한 값이 출력되도록 작성
		System.out.printf("%d - %d = %d%n", num, num1, num - num1);
		System.out.printf("%d - %d = %d", num2, num3, num2 - num3);
	}
}
