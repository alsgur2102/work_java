package ch04;

import javax.swing.plaf.synth.SynthSeparatorUI;

public class FlowEx22 {
	public static void main(String[] args) {
		// C��� ����ڸ� ���� �迭 ���� �� �ʱ�ȭ �ڵ�
		// �ڼ��� ������ 5�忡�� ����
		int[] arr = {10, 20, 30, 40, 50};
		int sum = 0;
		
		// ���� for��
		for (int i = 0; i < arr.length; i++) {
			System.out.printf("%d ", arr[i]);
		} 
		System.out.println();
		
		// ���� for�� (JDK 1.5 �������� ��밡��)
		// ����: for (Ÿ�� ������ : �迭 �Ǵ� �÷���)
		// �÷�����? 11�忡�� ����
		for (int tmp : arr) {
			System.out.printf("%d ", tmp);
			sum += tmp;
		}
		System.out.println();
		System.out.println("sum=" + sum);
	}
}
