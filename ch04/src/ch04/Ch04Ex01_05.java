package ch04;

import java.util.Scanner;

public class Ch04Ex01_05 {
	public static void main(String[] args) {
		// 1. �� ���� �Ǽ� �Է¹ޱ�  		
		Scanner scanner = new Scanner(System.in);
		String[] numbers = scanner.nextLine().split(" ");  
		double num1 = Double.parseDouble(numbers[0]);
		double num2 = Double.parseDouble(numbers[1]);	
		
		// 2. ��� 4.0 �̻��̸� "A" ���
		if (num1 >= 4.0 && num2 >= 4.0) {          
			System.out.println("A");
		
		}
		// 3. ��� 3.0 �̻��̸� "B" ���
		else if(num1 >= 3.0 && num2 >= 3.0) {  
			System.out.println("B");
			
		} 
		// 4. �ƴϸ� "C'���
		else {  
			System.out.println("C");
		}
	}
}
