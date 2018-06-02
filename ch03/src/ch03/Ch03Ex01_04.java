package ch03;

import java.util.Scanner;

public class Ch03Ex01_04 {

	public static void main(String[] args) {
		// 1. 두 개의 정수를 입력받기
		Scanner scanner = new Scanner(System.in);
		String strNum1 = scanner.nextLine();
		String strNum2 = scanner.nextLine();
		int num1 = Integer.parseInt(strNum1);
    	int num2 = Integer.parseInt(strNum2);
    	
    	// 2. 첫번째 줄은 두 정수의 값이 같으면 true, 아니면 false
    	System.out.println(num1==num2);
    	System.out.println(num1!=num2);
	} 	
}
