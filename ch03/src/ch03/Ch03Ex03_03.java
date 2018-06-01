package ch03;

import java.util.Scanner;

public class Ch03Ex03_03 {

	public static void main(String[] args) {
		 Scanner scanner = new Scanner(System.in);
			
			String strNum1 = scanner.nextLine();
			String strNum2 = scanner.nextLine();
			String strNum3 = scanner.nextLine();
			
			int num1 = Integer.parseInt(strNum1);
	    	int num2 = Integer.parseInt(strNum2);
	    	int num3 = Integer.parseInt(strNum3);
	    	
	    	double a = (double)(num1+num2+num3)/3;
	    	
	    	System.out.printf("%.1f", a);
	}
}
