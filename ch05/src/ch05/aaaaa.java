package ch05;

import java.util.Scanner;

public class aaaaa {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		String[] numbers = scanner.nextLine().split(" ");
		
		int[] counter = new int[6];
		
		for (int i = 0; i < numbers.length; i++) {
			int num = Integer.parseInt(numbers[i]);
			counter[num - 1]++;
		}
		for (int i = 0; i < counter.length; i++) {
			System.out.println(i + 1 + " : " + counter[i]);
		}
	}
}






