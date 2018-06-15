package ch04;

import java.util.Scanner;

public class Ch04Ex02_06 {
	public static void main(String[] args) {
		
		// 1. 나라 목록을 출력한다.
		System.out.println("1. Korea");
		System.out.println("2. USA");
		System.out.println("3. Japan");
		System.out.println("4. China");
		System.out.print("number? ");
		
		// 2. 나라에 대한 번호를 입력받는다.
		Scanner scanner = new Scanner(System.in);
		int num = Integer.parseInt(scanner.nextLine());
		
		// 3. 입력받은 번호를 이용하여 해당 나라의 수도를 출력
		switch (num) {
		case 1:
			System.out.println("Seoul");
			break;
		case 2:
			System.out.println("Washington");
			break;
		case 3:
			System.out.println("Tokyo");
			break;
		case 4:
			System.out.println("Beijing");
			break;
		default:
			System.out.println("none");
		}
	}
}
