package ch04;

import java.util.Scanner;

import javax.swing.plaf.synth.SynthSeparatorUI;

public class aaaa {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		double score = Double.parseDouble(scanner.nextLine());
		
		switch ((int)score) {
		
		case 4 :
			System.out.println("scholarship");
			break;
			
		case 3 :
			System.out.println("next semester");
			break;
			
		case 2 :
			System.out.println("seasonal semester");
			break;
			
		default :
			System.out.println("retake");
		}
	}
}
