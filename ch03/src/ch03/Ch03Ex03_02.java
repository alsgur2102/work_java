package ch03;

import java.util.Scanner;

public class Ch03Ex03_02 {

	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
		
		String strNum1 = scanner.nextLine();
		String strNum2 = scanner.nextLine();
		
		int num1 = Integer.parseInt(strNum1);
    	int num2 = Integer.parseInt(strNum2);
    	
    	int a = num1/num2;
    	double b = (double)num1/num2;
    	
    	System.out.printf("%d %.2f", a, b);
    	
	}
}
