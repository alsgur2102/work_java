package ch06;

public class PersonTest {
	public static void main(String[] args) {
		// 1. 사람 3명(객체 3개) 만들기
		Person p1 = new Person();
		Person p2 = new Person();
		Person p3 = new Person();
		
		// 2. 각 사람(객체)마다 이름, 나이, 주소를 설정하세요.
		// (자기 자신 포함해서 옆사람 정보 작성하기)
		p1.name = "강민혁";    p1.age = 19;    p1.addres = "부천";
		p2.name = "민혁강";    p2.age = 20;    p2.addres = "인천";
		p3.name = "강혁민";    p3.age = 21;    p3.addres = "서울";
				
		// 3. Person 클래스에서 만든 메서드를 각 사람(객체)마다 호출하세요.
		// for문 이용해도 좋고, 각각 3줄로 호출해도 됩니다.
		p1.aboutMe();
		p2.aboutMe();
		p3.aboutMe();
	}
}
