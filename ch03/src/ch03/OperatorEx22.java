package ch03;

public class OperatorEx22 {
    public static void main(String[] args) {
		float f = 0.1f;
		double d = 0.1;
		double d2 = (double)f;
		
				// double���� float���� ��. 10.0d == 10.0d. ���Ĺ߻� X. ��� �� true
				System.out.printf("10.0 == 10.0f    %b%n", 10.0 == 10.0f);
				
				// double���� float���� ��. 0.1d == 0.1d.
				// float��double�� ����ȯ�ϸ鼭 �����߻�. ��� �� fales
				System.out.printf("0.1 == 0.1f      %b%n", 0.1 == 0.1f);
				
				// �� 19�ڸ�. �Ҽ��� 17�ڸ� ǥ��. ���� f, d, d2 ���
				System.out.printf("f = %19.17f%n", f);
				System.out.printf("d = %19.17f%n", d);
				System.out.printf("d2 = %19.17f%n", d2);
				
				// �� ��µ� ���� �����Ͽ� �Ʒ� ����� Ȯ���غ���
			    System.out.printf("d == f  %b%n", d == f);
			    System.out.printf("d == d2 %b%n", d2 == f);
			    System.out.printf("d2 == f %b%n", d2 == f);
			    System.out.printf("(float)d == f   %b%n", (float)d == f);
	}
}
