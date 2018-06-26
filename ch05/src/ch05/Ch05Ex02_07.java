package ch05;

import java.util.Scanner;

public class Ch05Ex02_07 {
	public static void main(String[] args) {
		// 999�� ��Ÿ���� ������ �Է��� �����ϹǷ� �켱 ũ�� 2�� �迭 ����
		int[] stream = new int[2];
		
		// stream �迭�� ���� �ε��� ��ȣ�� �����ϴ� ���� i
		int i = 0;
		
		// ������ �Է� �����Ƿ� ���ѹݺ��Ѵ�.
		while (true) {
			// ���� �ϳ� �Է¹ޱ�
			Scanner scanner = new Scanner(System.in);
			int num = Integer.parseInt(scanner.nextLine());
			
			// 2-4���� �Ȱ��� �ڵ��̹Ƿ� ����
			if (i == stream.length) {
				int[] tmp = new int[stream.length * 2];
				System.arraycopy(stream, 0, tmp, 0, stream.length);
				stream = tmp;
			}
			
			// �Է¹��� ������ �迭�� ����
			stream[i] = num;
			
			// ���� 999�� ��� ���� �ݺ����� �������´�.
			if (stream[i] == 999) {
				break;
			}
			
			// stream �迭�� �ε��� ��ȣ 1 ����
			i++;
		}
		
		// �ּҰ��� �ִ밪�� �ʱⰪ�� �Է¹��� stream �迭�� ù��° ������ �Ѵ�.
		int min = stream[0];
		int max = stream[0];
		
		// stream �迭�� ���� �ε��� ��ȣ�� 0���� �ʱ�ȭ
		i = 0;
		
		// stream �迭���� ���� ������ 999�� �ƴ� ���� ��� �ݺ�
		while (stream[i] != 999) {
			min = min < stream[i] ? min : stream[i];
			max = max > stream[i] ? max : stream[i];
			i++;
		}
		
		// ��� ���
		System.out.println("max : " + max);
		System.out.println("min : " + min);
	}
}
