package ch03;

public class OperatorEx17 {
    public static void main(String[] args) {
	    double pi = 3.141592;
	    
	    /*
	     * ������ �켱����
	     * 1. ��ȣ ����
	     * 2. �� ��ȯ
	     * 3. ��Ģ���� ��
	     * 
	     * (int)(3141.592 + 0.5) / 1000.0;
	     * (int)(3142.092) / 1000.0;    // �ݿø��� ȿ��
	     * 3142 / 1000.0;
	     * 3.142
	     */
	    double shortPi = (int) (pi * 1000 + 0.5) / 1000.0;
	    
	    System.out.println(shortPi); // 3.142
	}
}
