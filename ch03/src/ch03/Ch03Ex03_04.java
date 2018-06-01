package ch03;

import java.util.Scanner;

public class Ch03Ex03_04 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		String strNum1 = scanner.nextLine();
		String strNum2 = scanner.nextLine();
		String strNum3 = scanner.nextLine();
		
		double num1 = Double.parseDouble(strNum1);
    	double num2 = Double.parseDouble(strNum2);
    	double num3 = Double.parseDouble(strNum3);
    	
    	int a = (int)num1;
    	int b = (int)num2;
    	int c = (int)num3;
    	int sum = a + b + c;
    	int avg = (int) (num1 + num2 + num3)/3;
    	
    	System.out.printf("sum %d%navg %d", sum, avg);
	}
}
