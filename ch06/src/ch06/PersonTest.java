package ch06;

public class PersonTest {
	public static void main(String[] args) {
		// 1. 사람 3명(객체 3개) 만들기
		/*Person p1 = new Person();
		Person p2 = new Person();
		Person p3 = new Person();*/
		Person[] persons = new Person[3];

		// 2. 각 사람(객체)마다 이름, 나이, 주소를 설정하세요.
		// (자기 자신 포함해서 옆사람 정보 작성하기)
		/*p1.name = "강민혁";    p1.age = 19;    p1.address = "부천";
		p2.name = "민혁강";    p2.age = 20;    p2.address = "인천";
		p3.name = "강혁민";    p3.age = 21;    p3.address = "서울";
		for (int i = 0; i < persons.length; i++) {
			persons[i] = new Person();
		}*/

		// [2-2] 아래 방법은 객체를 생성 후 각 인스턴스 변수에 접근하여
		// 값을 초기화 한 부분이다.
		// 아래 부분을 2-1에서 작성한 생성자를 이용하여 변경하시오.

		/*persons[0].name = "강민혁";
		persons[0].age = 19;
		persons[0].address = "부천";*/
		persons[0] = new Person("강민혁", 19, "부천");

		/*persons[1].name = "민혁강";
		persons[1].age = 20;
		persons[1].address = "인천";*/
		persons[1] = new Person("민혁강", 20, "인천");

		/*persons[2].name = "강혁민";
		persons[2].age = 21;
		persons[2].address = "서울";*/
		persons[2] = new Person("강혁민", 21, "서울");


		// 3. Person 클래스에서 만든 메서드를 각 사람(객체)마다 호출하세요.
		// for문 이용해도 좋고, 각각 3줄로 호출해도 됩니다.
		/*p1.aboutMe();
		p2.aboutMe();
		p3.aboutMe();*/
		for (int i = 0; i < persons.length; i++) {
			persons[i].aboutMe();
		}
		
		// [2-4] 2-3에서 생성한 생성자를 이용하여 "흥민"이라는 이름으로 사람 객체 하나를 생성하세요.
		Person heungMin = new Person("흥민");

		// [2-5] 2-4 객체를 이용하여 aboutMe() 메서드를 호출하세요
		heungMin.aboutMe();
	}	
}
//}
