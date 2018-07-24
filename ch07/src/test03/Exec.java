package test03;

import java.util.ArrayList;

public class Exec {

	public static void main(String[] args) {
		ArrayList<Person> pList = new ArrayList<Person>();
		for (int i = 0; i < 5; i++) {
			// 이름은 테스트1, 테스트2... 테스트5
			// 나이는 10, 20... 50
			// 포인트는 여러분 마음대로
			String name = "테스트" + (i + 1);
			int age = (i + 1) * 10;
			Person p = new Person();
			p.setName(name);
			p.setAge(age);
			pList.add(p);
		}
		for (int i = 0; i < 5; i++) {
			Person p = pList.get(i);
			System.out.println(p.getName() + "," + p.getAge());
		}
	}
}