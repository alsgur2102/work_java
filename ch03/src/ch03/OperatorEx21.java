package ch03;

public class OperatorEx21 {
    public static void main(String[] args) {
    	// ���� Ÿ������ �����Ͽ� ���Ѵ�. 10.1f == 10.0f�� ����.
		System.out.printf("10== 10.0f    \t %b%n", 10==10.0f);
		
		// ���� '0'�� �ƽ�Ű �ڵ尪�� 48�� ��. 48 == 0 �� ����� false
		System.out.printf("'0'== 0       \t %b%n", '0'== 0);
		
		// ���� 'A'�� �ƽ�Ű �ڵ尪�� 65�� ��. 65 == 65 �� ����� true
		System.out.printf("'A'== 65      \t %b%n", 'A'== 65);
		
		// �� ������ �ƽ�Ű �ڵ尪�� ��. 65 > 66 �� ����� false
		System.out.printf("'A' > 'B'     \t %b%n", 'A' > 'B');
		
		// ������ �ܰ迡�� 'A' + 1�� 'B'�� ġȯ
		// �� ������ �ƽ�Ű �ڵ尪���� ��. 66 != 66 �� ����� false
		System.out.printf("'A'+1 i= 'B'  \t %b%n", 'A' +1 != 'B');
	}
}
