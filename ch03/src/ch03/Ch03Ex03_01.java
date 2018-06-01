package ch03;

import java.util.Scanner;

public class Ch03Ex03_01 {

	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
		
		String strNum1 = scanner.nextLine();
		String strNum2 = scanner.nextLine();
		
		double num1 = Double.parseDouble(strNum1);
    	double num2 = Double.parseDouble(strNum2);
    	
    	int i = (int) num1;
    	int i2 = (int)num2;
    	int a = (int)(num1*num2);
    	int a2 = i * i2;
        		
    	System.out.printf("%d %d", a, a2);
	}
}
