package ch04;

import java.util.Scanner;

public class Ch04Ex01_02 {
	public static void main(String[] args) {
		// 1. Ű�� �����Ը� ���η� �Է¹ޱ�
		Scanner scanner = new Scanner(System.in);	
		String[] numbers = scanner.nextLine().split(" ");		
		int height = Integer.parseInt(numbers[0]);
    	int weight = Integer.parseInt(numbers[1]);
    	
		// 2. �񸸼�ġ ������ �̿��ؼ� ���
    	int obesity = weight + 100 - height;
    	
    	// 3. �񸸼�ġ ���
    		System.out.println(obesity);
    		
    	// 4. ���̸�(�񸸼�ġ�� 0���� ũ��) "Obesity" ���ڿ� ���
    	if (obesity > 0) {
    		System.out.println("Obesity");
    	}
    }
}

