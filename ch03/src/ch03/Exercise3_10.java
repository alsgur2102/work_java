package ch03;

public class Exercise3_10 {

	public static void main(String[] args) {
		char ch = 'A';
		
		char lowerCase = (char) ((65<=ch&&ch<=90) ? ((char)ch+32) : ch);
		
		System.out.println("ch:"+ch);
		System.out.println("ch to lowerCase:"+lowerCase);
  }
}