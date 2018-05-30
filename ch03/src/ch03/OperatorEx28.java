package ch03;

public class OperatorEx28 {
    public static void main(String[] args) {
		int x = 0xAB, y = 0xF;
		
		System.out.printf("x = %#X \t\t%s%n", x, toBinaryString(x));
		System.out.printf("y = %#X \t\t%s%n", y, toBinaryString(y));
		System.out.printf("%#X | %#X = %#X \t%s%n", x, y, x | y, toBinaryString(x | y));
		System.out.printf("%#X & %#X = %#X \t%s%n", x, y, x & y, toBinaryString(x & y));
		System.out.printf("%#X ^ %#X = %#X \t%s%n", x, y, x ^ y, toBinaryString(x ^ y));
		System.out.printf("%#X ^ %#X ^ %#X = %#X %s%n", x, y, y, x ^ y ^ y, toBinaryString(x ^ y ^ y));
	} // main�� ��
    
    // 10�� ������ 2������ ��ȯ�ϴ� �޼ҵ�
    static String toBinaryString(int x) {
    	String zero = "00000000000000000000000000000000";  // 32��Ʈ(32��)
    	String tmp = zero + Integer.toBinaryString(x);
    	
    	/*
    	 * substring(int) �޼ҵ�
    	 * ��ȣ ���� int ���� �ش��ϴ� ���ں��� ���ڿ��� �߶󳽴�.
    	 */
    	return tmp.substring(tmp.length() - 32);
    }

}
