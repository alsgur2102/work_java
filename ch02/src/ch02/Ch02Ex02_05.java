package ch02;

import java.util.Scanner;

public class Ch02Ex02_05 {

	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        String input = scanner.nextLine();
		String input1 = scanner.nextLine();
		
		int num = Integer.parseInt(input);
		float num1 = Float.parseFloat(input1);
		
		System.out.printf("%d * %f = %f", num, num1, num - num1);
	}	
}
