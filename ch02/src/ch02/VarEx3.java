package ch02;

public class VarEx3 {

	final static int MAX_SPEED = 10;    // MAX_SPEED�� ���, 10�� ���ͷ�
	final static int WIDTH = 20;        // �ﰢ���� �غ�
	final static int HEIGHT = 10;        // �ﰢ���� ����
	/*
	 * final�� ������ ������ MAX_SPEED��
	 * ���α׷��� ����� ������ 10���� ����
	 */
	
	public static void main(String[] args) {
		//MAX_SPEED = 20; ����� ���� ������ �� ����.
		System.out.println(MAX_SPEED); // ��� MAX_SPEED ���� ���
		
		int triangleArea = WIDTH * HEIGHT / 2;
		System.out.println(triangleArea);
	}
}
