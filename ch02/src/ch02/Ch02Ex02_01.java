package ch02;

import java.util.Scanner;

public class Ch02Ex02_01 {

	public static void main(String[] args) {
		// 1. �Է¹ޱ� ���� ��ĳ�� ��ü ����, System.in�� Ű����
		Scanner scanner = new Scanner(System.in);
		
		// 2. scanner�� �̿��Ͽ� ���� �Է¹ޱ� (���� �Է�)
		String strKor = scanner.nextLine();
		String strMat = scanner.nextLine();
		String strEng = scanner.nextLine();
		
		// 3. ���ڿ��� �Է¹��� ������ ����(int)������ ����
		int kor = Integer.parseInt(strKor);
		int mat = Integer.parseInt(strMat);
		int eng = Integer.parseInt(strEng);
		
		// 4. �հ�� ����� ���ϱ�
		int sum = kor + mat + eng;
		int avg = sum / 3;
		
		// 5. printf()�� �̿��Ͽ� ���
		System.out.printf("kor %d%n", kor);
		System.out.printf("mat %d%n", mat);
		System.out.printf("eng %d%n", eng);
		System.out.printf("sum %d%n", sum);
		System.out.printf("avg %d%n", avg);
	}
}
