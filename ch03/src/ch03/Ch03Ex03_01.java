package ch03;

import java.util.Scanner;

public class Ch03Ex03_01 {

	public static void main(String[] args) {
        // 1. �� ���� �Ǽ��� ���η� �Է¹ޱ�
		Scanner scanner = new Scanner(System.in);	
		String[] numbers = scanner.nextLine().split(" ");		
		double num1 = Double.parseDouble(numbers[0]);
    	double num2 = Double.parseDouble(numbers[1]);
    	
    	// 2. �� ���� ���� ��ٰ� ������ ��ȯ(int����ȯ)
    	int res1 = (int)(num1 * num2);
    	
        // 3. �� ���� ���� ������ ��ȯ�Ͽ� ���� ���ϱ�
    	int res2 = (int)num1 * (int)num2;
    	
    	// 4. ��� ���
    	System.out.printf("%d %d", res1, res2);
	}
}
