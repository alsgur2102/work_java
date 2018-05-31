package ch03;

import java.util.Scanner;

public class Ch03Ex02_02 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		String strNum1 = scanner.nextLine();
		String strNum2 = scanner.nextLine();
		
		int num1 = Integer.parseInt(strNum1);
    	int num2 = Integer.parseInt(strNum2);   
    	
    	int a = num1+5;
    	int b = num2*2;
    	
    	System.out.printf("width = %d%n", a);
    	System.out.printf("length = %d%n", b);
    	System.out.printf("area = %d", a * b);
  }
}