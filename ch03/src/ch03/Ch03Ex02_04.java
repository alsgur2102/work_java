package ch03;

import java.util.Scanner;

public class Ch03Ex02_04 {

	public static void main(String[] args) {
       // 1. �� �ٿ� �� ������ �Է¹޾� �� �� �� �Է¹ޱ�(���� 4��)
		Scanner scanner = new Scanner(System.in);		
		String[] numbers01 = scanner.nextLine().split(" ");		
		int minsooHeight =Integer.parseInt(numbers01[0]);
		int minsooWeight =Integer.parseInt(numbers01[1]);
    	
    	String[] numbers02 = scanner.nextLine().split(" ");
    	int kiyeongHeight = Integer.parseInt(numbers02[0]);
    	int kiyeongWeight = Integer.parseInt(numbers02[1]);
    	
    	// 2. ���ǿ�����(���׿�����) �� �� �̿��ؼ� ���ϱ�
    	boolean isGreatesMinsoo = minsooHeight > kiyeongHeight ? (minsooWeight > kiyeongWeight ? true : false) : false;
    	
    	// 3. ����ϱ�
        System.out.println(isGreatesMinsoo);
	}
}
