package ch03;

import java.util.Scanner;

public class Ch03Ex01_01 {
  		
    	public static void main(String[] args) {
    		Scanner scanner = new Scanner(System.in);
    		
    		// 1. 정수 2개 입력 받기
    		String strNum1 = scanner.nextLine();
    		String strNum2 = scanner.nextLine();
    		
    		int num1 = Integer.parseInt(strNum1);
        	int num2 = Integer.parseInt(strNum2);
        	
        	// 2. 첫 번째 수에는 100을 증가, 두 번째 수에는 10으로 나눈 나머지 저장
        	int strnum1 = num1 + 100;
        	int strnum2 = num2 % 10;		
        	
        	// 3. 결과 출력
        	System.out.printf("%d %d", strnum1, strnum2);
	}
}
