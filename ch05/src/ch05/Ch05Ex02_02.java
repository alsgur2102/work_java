package ch05;

import java.util.Scanner;

public class Ch05Ex02_02 {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		String[] numbers = scanner.nextLine().split(" ");
		
		// ���ڿ� �迭�� numbers�� int������ ��ȯ�Ͽ� ������ �迭 nums ����
		int[] nums = new int[numbers.length];
	
		// numbers �迭�� �ִ� ���ڿ��� �ϳ��� ������� int������ ���� �� nums �迭�� ����
		for (int i = 0; i < numbers.length; i++) {
			nums[i] = Integer.parseInt(numbers[i]);
		}
		
		// nums�� ù��°, ����°, �ټ���° ���� ������� ���� ����� ���
		System.out.println(nums[0] + nums[2] + nums[4]); 
	}
}
