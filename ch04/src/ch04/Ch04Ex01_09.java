package ch04;

import java.util.Scanner;

public class Ch04Ex01_09 {
	public static void main(String[] args) {
		// 1. 3���� ���� �Է¹ޱ�
		Scanner scanner = new Scanner(System.in);	
		String[] numbers = scanner.nextLine().split(" ");		
		int num1 = Integer.parseInt(numbers[0]);
    	int num2 = Integer.parseInt(numbers[1]);
    	int num3 = Integer.parseInt(numbers[2]);
    	
    	// 2. ���ǿ�����(���׿�����)�� �̿��Ͽ� ù��°�� �ι�° �� ��
    	int min01 = num1 < num2 ? num1 : num2;
    	
    	// 3. ���ǿ�����(���׿�����)�� �̿��Ͽ� 2������ �������� ����° �� ��
    	int min02 = min01 < num3 ? min01 : num3;
    	
    	// 4. ���������� ���� ���� �G�ڴ� min02 ������ ����ȴ�.
    	// min02 ������ ����Ѵ�.
    	System.out.println(min02);
	}
}
