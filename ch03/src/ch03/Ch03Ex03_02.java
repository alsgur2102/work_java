package ch03;

import java.util.Scanner;

public class Ch03Ex03_02 {

	public static void main(String[] args) {
		// 1. �� ���� ���� ���η� �Է¹ޱ�
        Scanner scanner = new Scanner(System.in);	
		String[] numbers = scanner.nextLine().split(" ");
		int num1 = Integer.parseInt(numbers[0]);
    	int num2 = Integer.parseInt(numbers[1]);
    	
    	// 2. ù ��° ���� �� ��° ���� ���� ���� ���
    	int res1 = num1/num2;
    	
    	// 3. ù ��° ���� �Ǽ��� ��ȯ�Ͽ� �� ��° ���� ���� �� ���ϱ�
    	double res2 = (double)num1/num2;   
    	
    	// 4. ��� ���
    	System.out.printf("%d %.2f", res1, res2);	
	}
}
