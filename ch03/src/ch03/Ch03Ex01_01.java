package ch03;

import java.util.Scanner;

public class Ch03Ex01_01 {
  		
    	public static void main(String[] args) {
    		Scanner scanner = new Scanner(System.in);
    		
    		String strNum1 = scanner.nextLine();
    		String strNum2 = scanner.nextLine();
    		
    		int num1 = Integer.parseInt(strNum1);
        	int num2 = Integer.parseInt(strNum2);
        	
        	int strnum1 = num1 + 100;
        	int strnum2 = num2 % 10;		
        	
        	System.out.printf("%d %d", strnum1, strnum2);
	}
}
