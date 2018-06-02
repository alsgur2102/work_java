package ch03;

import java.util.Scanner;

public class Ch03Ex02_01 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String[] numbers = scanner.nextLine().split(" ");		
		int num1 = Integer.parseInt(numbers[0]);
    	int num2 = Integer.parseInt(numbers[1]); 
    	 
    	// 2. ³ª´« ¸ò, ³ª¸ÓÁö ±¸ÇÏ±â
    	int quotient = num1 / num2;
    	int remainder = num1 % num2;
    	
    	System.out.printf("%d/%d=%d...%d", num1, num2, quotient, remainder);
  }
}