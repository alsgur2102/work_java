package ch05;

import java.util.Scanner;

public class Ch05Ex01_05 {
	public static void main(String[] args) {
		// 1. �ݺ� ��� ������ �����ϴ� �迭
		double[] avgs = {85.6, 79.5, 83.1, 80.0, 78.2, 75.0};
		
		// 2. �� ���� �� ��ȣ�� �Է¹ޱ�
		Scanner scanner = new Scanner(System.in);
		String[] classes = scanner.nextLine().split(" ");
		
		// 3. �Է¹��� ��ȣ�� �̿��Ͽ� �� ���� ��հ� �迭���� �������
		double num01 = avgs[Integer.parseInt(classes[0]) - 1];
		double num02 = avgs[Integer.parseInt(classes[1]) - 1];
		
		// 4. �� ���� ��������� ��
		double sum = num01 + num02;
		
		// 5. �Ҽ� ù°�ڸ����� ����ϱ�
		System.out.printf("%.1f", sum);
	}
}
