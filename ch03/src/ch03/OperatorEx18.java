package ch03;

public class OperatorEx18 {
    public static void main(String[] args) {
		double pi = 3.141592;
		
		/*
		 * Math.round() �޼ҵ�
		 * ��ȣ ���� ���ڸ� �Ҽ� ù°�ڸ����� �ݿø��Ѵ�.
		 * ��ȣ �ѿ� �� �� �ִ� ���ڴ� float, double�� ���� �Ǽ��� ���
		 * �� �޼ҵ��� ������� long���̴�.
		 * 
		 * Math.round(3141.592) / 1000.0;
		 * 3142 / 1000.0;   // long�� / double��
		 * 3.142 (double��) 
		 */
		double shortPi = Math.round(pi * 1000) / 1000.0;
		
		System.out.println(shortPi);
	}
}
