package ch03;

public class OperatorEx15 {
    public static void main(String[] args) {
    	// 'a'�� �ƽ�Ű �ڵ尪�� 97
    	// 'A'�� �ƽ�Ű �ڵ尪�� 65
    	// �빮�� 'A'�� �ҹ��� 'a'�� ���̴� 32
    	// ���� �빮�� 'A'�� +32�ϸ� �ҹ��� 'a'
    	// �ҹ��� 'a' -32�ϸ� �빮�� 'A'�� �ȴ�.
    	
    	// �빮�� 'B'�� �ҹ��� 'b'�� ���̵� 32�̴�.
    	
		char lowerCase = 'a';
		char upperCase = (char) (lowerCase - 32); // 97 - 32 = 65 'A'
		
		System.out.println(upperCase); // 'A'
	}
}
