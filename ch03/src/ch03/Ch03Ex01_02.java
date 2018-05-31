package ch03;

import java.util.Scanner;

public class Ch03Ex01_02 {
	 
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		String strNum = scanner.nextLine();
		
		int num = Integer.parseInt(strNum);
		
		System.out.println(num++);
		System.out.println(++num);
	}
}


    		
    	
