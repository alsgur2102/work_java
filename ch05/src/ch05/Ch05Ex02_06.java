package ch05;

import java.util.Scanner;

public class Ch05Ex02_06 {
	public static void main(String[] args) {
		char[] alphabets = {'A', 'P', 'P', 'L', 'E', '!'};
		// �������� �־��� �迭 ���� �� �ʱ�ȭ
		
		// ���� �ϳ��� �Է¹޴´�.
		Scanner scanner = new Scanner(System.in);
		char ch = scanner.nextLine().charAt(0);

		// �Է¹��� ���ڿ� ��ġ�ϴ� ���ڰ� alphabets �迭�� ���� �ִٸ�
		// isFind ���� true, �ƴϸ� false
		boolean isFind = false;
		
		// alphabets �迭�� ó������ ���ʷ� Ž���Ѵ�.
		for (int i = 0; i < alphabets.length; i++) {
			// ���� �Է��� ���ڿ� �迭�� �ִ� ���ڰ� ��ġ�� ���
			if (ch == alphabets[i]) {
				// ��ġ�ϴ� ���ڰ� �ִٴ� ǥ�÷� isFind ���� true�� ����
				isFind = true;
				
				// �̶��� �ε��� ��ȣ�� ���
				System.out.print(i + " ");
				
				// �ݺ����� �������´�.
				// break;
			}
		}
		
		// ���� ��ġ�ϴ� ���ڰ� ���� ���� "none"�� ���
		if (isFind == false) {
			System.out.println("none");
		}
	}
}
