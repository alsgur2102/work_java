package ch04;

import java.util.Scanner;

public class Ch04Ex01_06 {
	public static void main(String[] args) {
		// 1. ���ڿ��� ���� ���� �ϳ��� �Է¹ޱ�
		Scanner scanner = new Scanner(System.in);
		String[] inputs = scanner.nextLine().split(" ");
		String gender = inputs[0];
		int age = Integer.parseInt(inputs[1]);
    	
		/*// [��� 1]
		// 2. ���γ����� ���
    	if (gender.equals("M") && age >= 18) {
    		System.out.println("MAN");
    	}
    	
    	// 3. ���ο����� ���
    	if (gender.equals("F") && age >= 18) {
    		System.out.println("WOMAN");
    	}
    	
    	// 4. �̼��Ⳳ���� ���
    	if (gender.equals("M") && age < 18) {
        		System.out.println("BOY");
    	}
    	
    	// 5. �̼��⿩���� ���
    	if (gender.equals("F") && age < 19) {
    		System.out.println("GIRL");
    	}*/
		
		// [��� 2] : ũ�� ������ ������, ���� �������� �̼������� ����
		if (gender.equals("M")) {
			if (age >= 18) {
				System.out.println("MAN");
			}
			else {
				System.out.println("BOY");
			}
		}
		else if (gender.equals("F")) {
			if (age >= 18) {
				System.out.println("WOMAN");
			}
			else {
				System.out.println("GIRL");
			}
		}
   	}
}

