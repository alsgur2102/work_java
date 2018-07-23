package test02;

public class Exec2 {
	
	public static void main(String[] args) {
		Action a = new Person("홍길동", 33);
		a.run();
		a.walk();
		a.sleep();
		a.wakeUp();
		
		a = new Cat("동동이", 5);
		a.run();
		a.walk();
		a.sleep();
		a.wakeUp();
	}
}
