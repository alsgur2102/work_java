package ch05;

import java.util.Scanner;

public class Ch05Ex01_01 {
	public static void main(String[] args) {
		char[] Arr = new char[10];
		
		Scanner scanner = new Scanner(System.in);
		String[] Arr1 = scanner.nextLine().split(" ");
		
		for (char i = 0; i < Arr1.length; i++) {
			System.out.print(Arr1[i]);
		}
	}
}
