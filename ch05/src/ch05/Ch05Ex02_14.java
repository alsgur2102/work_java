package ch05;

public class Ch05Ex02_14 {
	public static void main(String[] args) {
		// 1. �������� �־��� 2���� �迭 ���� �� �ʱ�ȭ
		int[][] array = {
				{3, 5, 9},
				{2, 11, 5},
				{8, 30, 10},
				{22, 5, 1}
		};
		
		// �迭�� ������ ������ ���� ���� �� �ʱ�ȭ
		int sum = 0;
		
		// i�� ���ȣ
		for (int i = 0; i < array.length; i++) {
			// j�� ����ȣ
			for (int j = 0; j < array[i].length; j++) {
				// �ش� ���� ���� ���� ���� ���
				System.out.print(array[i][j] + " ");
				
				// �ش� ���� sum������ ���ϱ�
				sum += array[i][j];
			}
			System.out.println();
		}
		
		// ���������� ������ ����ϱ�
		System.out.println(sum);
	}
}
