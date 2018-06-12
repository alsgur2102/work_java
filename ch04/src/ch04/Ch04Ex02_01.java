package ch04;

public class Ch04Ex02_01 {
	public static void main(String[] args) {
		int i = 0;
		
		while (++i <= 15) {
			System.out.print(i);
			System.out.printf("%1c", ' ');
		}
	}
}
