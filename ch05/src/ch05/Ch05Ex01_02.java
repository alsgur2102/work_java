package ch05;

public class Ch05Ex01_02 {
	public static void main(String[] args) {
		// [规过 1]
		int[] numbers01 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		for (int i = 0; i < numbers01.length; i++) {
			System.out.print(numbers01[i] + " ");
		}
		System.out.println();

		// [规过 2]
		int[] numbers02 = new int[10];
		for (int i = 0; i < numbers02.length; i++) {
			numbers02[i] = i + 1;
		}

		for (int i = 0; i < numbers02.length; i++) {
			System.out.print(numbers02[i] + " ");
		}
	}
}
