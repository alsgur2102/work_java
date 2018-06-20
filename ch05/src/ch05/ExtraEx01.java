package ch05;

public class ExtraEx01 {
	public static void main(String[] args) {
		// charAt() 예제
		
		String a = "KOITT";
		String b = "APPLE";
		String c = "CAR";
		
		// 1. charAt()을 이용하여 변수 result에 "KOREA"를 담아보세요.
		char[] result = {a.charAt(0), a.charAt(1), c.charAt(2), b.charAt(4), c.charAt(1)}; 
		
		// 2. 1번에서 담은 "KOREA"를 출력해보세요.
		System.out.println(result);
	}
}
