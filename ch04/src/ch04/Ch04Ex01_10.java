package ch04;

import java.util.Scanner;

public class Ch04Ex01_10 {
	public static void main(String[] args) {
		// 1. �� ������ �Է¹ޱ�
		Scanner scanner = new Scanner(System.in);	
		String[] numbers = scanner.nextLine().split(" ");		
		int num1 = Integer.parseInt(numbers[0]);
    	int num2 = Integer.parseInt(numbers[1]);
    	
    	//  2. ū ������ ���� ���� ����
    	if (num1 > num2) {
    		System.out.println(num1 - num2);
    	} 
    	else  {
    		System.out.println(num2 - num1);
    	}
    	
    	// ���� : �޼ҵ� �̿��ؼ� ���ϴ� ���
    	// Math.abs() : ���밪 �����ϴ� �޼ҵ�
    	System.out.println(Math.abs(num1 - num2));
	}
}
