package ch03;

public class Exercise3_08 {

	public static void main(String[] args) {
		byte a = 10;
		byte b = 20;
		byte c = (byte) (a + b);
		char ch = 'A';
		ch = (char) (ch + 2);
		float f = (float) (3 / (double)2);
		long l = (long)3000 * (long)3000 * (long)3000;
		float f2 = 0.1f;
		double d = 0.1;
		boolean result = d!=f2;
		System.out.println("c="+c);
		System.out.println("ch="+ch);
		System.out.println("f="+f);
		System.out.println("l="+l);
		System.out.println("result="+result);
	}
}