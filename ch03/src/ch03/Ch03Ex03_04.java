package ch03;

import java.util.Scanner;

public class Ch03Ex03_04 {

	public static void main(String[] args) {
		// 1. �Ǽ� 3���� ���η� �Է¹ޱ�
		Scanner scanner = new Scanner(System.in);
		String[] numbers = scanner.nextLine().split(" ");
		double kor = Double.parseDouble(numbers[0]);
    	double eng = Double.parseDouble(numbers[1]);
    	double math = Double.parseDouble(numbers[2]);
    	
    	// 2. ������ �����κ��� �հ� -> int����ȯ�ؼ� �հ� ���ϱ�
    	int sum = (int)kor + (int)eng + (int)math;
        
    	// 3. ����� �Ǽ��� ����� ���� �� �����κи� ��� -> �Ǽ��� ����� int����ȯ�ϱ�
    	int avg = (int)((kor + eng + math) / 3);
    	
    	// 4. ��� ���
    	System.out.printf("%s %d%n%s %d%n", "sum", sum, "avg", avg);
	}
}
