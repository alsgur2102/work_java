package ch03;

import java.util.Scanner;

public class Ch03Ex01_02 {
	 
	public static void main(String[] args) {
		// 1. 1���� ���� �Է¹ޱ�
		Scanner scanner = new Scanner(System.in);
	    String strNum = scanner.nextLine();
		int num = Integer.parseInt(strNum);
		
		// 2. ��ġ ���� �����ڿ� ��ġ ���� �����ڸ� ����Ͽ� ���
		System.out.println(num++);
		System.out.println(++num);
	}
}


    		
    	
