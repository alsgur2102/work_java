package ch05;

import java.util.Scanner;

public class Ch05Ex02_04 {
	public static void main(String[] args) {
		// �ʱ⿡�� 2ĭ¥�� �迭�� �켱 �����Ѵ�.
		int[] stream = new int[2];

		// �Է��� ���� ���� ������ �ε�����ȣ i
		int i = 0;

		// ������ �ݺ��Ѵ�.
		while (true) {
			// ���� �ϳ��� ���ڿ��� �Է¹޴´�.
			Scanner scanner = new Scanner(System.in);
			String num = scanner.nextLine();

			// ���� �迭�� ���� �����
			if (i == stream.length) {
				// �ӽ÷� stream �迭�� 2��ũ���� �迭 tmp�� �����Ѵ�.
				int[] tmp = new int[stream.length * 2];
				// stream �迭�� ��� �ִ� ��� ������ tmp �迭�� �����Ѵ�.
				System.arraycopy(stream, 0, tmp, 0, stream.length);
				
				// �츮�� stream �迭�� ����� ���̹Ƿ� tmp�迭�� stream�迭�� �����Ѵ�.
				// (tmp�迭�� �ּҰ��� stream �迭�� �ּҰ����� �����Ѵ�.)
				// �ڹ� �޸� ���� �׸����� �׷��� ���� ����帳�ϴ�.
				stream = tmp;
			}
			
			// �Է¹��� ������ int������ ���� �� stream �迭�� ����
			stream[i] = Integer.parseInt(num);
			
			// ���� �Է¹��� ������ -1 ���̸� ���ѹݺ��� �����.
			if(stream[i] == -1) {
				break;
			}
			
			// stream �迭�� ���� ĭ�� ����Ű�� ���� �ε��� ��ȣ ����
			i++;
		}
		
		// stream �迭�� ��ü������ Ž���Ѵ�.
		for (int j = 0; j < stream.length; j++) {
			// ���� -1�� �߰ߵǸ�
			if (stream[j] == -1) {
				// �ε�����ȣ(j)���� 3 �̸��̸� ���� �ε��� ��ȣ�� ����ϰ�
				// 3 �̻��̸� ���� �ε��� ��ȣ���� ������ 3ĭ�� ������ ���
				int init = j < 3 ? j : 3;
				
				// -1�� ������ ������ �� ���� ������ ���
				for (int k = init; k >= 1; k--) {
					System.out.print(stream[j - k] + " ");
				}
				break;
			}
		}
	}
}
