package ch02;

import java.util.Scanner;

public class Ch02Ex02_07 {
    public static void main(String[] args) {
		// 1. Scaner ��ü ����(System.in�� Ű����)
        Scanner scanner = new Scanner(System.in);
        
        // 1-1. ������ �Է¹����� �ȳ��ϴ� ���� ����ϱ�
        System.out.print("height = ");
        
        // 2. ���� �ϳ� ���ڿ��� �Է¹ޱ�
        String strNum1 = scanner.nextLine();
        
        // 3. �Է¹��� ������ ����(int)������ �����ϱ�
        int height = Integer.parseInt(strNum1);
        
        // 4. height ������ �̿��Ͽ� ����ϱ�
        System.out.printf("Your height is %dcm.", height);
	}
}
