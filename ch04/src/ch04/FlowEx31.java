package ch04;

public class FlowEx31 {
	public static void main(String[] args) {
		for (int i = 0; i <= 10; i++) {
			if (i % 3 == 0) {
				// continue�� �����ϸ� �Ʒ� ������� ������ ���� �ʰ� for�� ó������ ���ư���.
				continue;
			}
			System.out.println(i);
		}
	}
}
