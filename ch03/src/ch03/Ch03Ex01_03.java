package ch03;

import java.util.Scanner;

public class Ch03Ex01_03 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		String strNum1 = scanner.nextLine();
		String strNum2 = scanner.nextLine();
		
		int num1 = Integer.parseInt(strNum1);
    	int num2 = Integer.parseInt(strNum2);
    	
        int a = num1++;
        int b = --num2;
    	
    	System.out.printf("%d %d %d", num1, num2, a * b);
  }
}	
