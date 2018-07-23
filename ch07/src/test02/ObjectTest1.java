package test02;

public class ObjectTest1 extends Object{
	public int a;
	public ObjectTest1(int a) {
		this.a = a;
	}
	public boolean test(ObjectTest1 ot) {
		return this.a == ot.a;
	}
	
	public static void main(String[] args) {
		ObjectTest1 ot1 = new ObjectTest1(2);
		ObjectTest1 ot2 = new ObjectTest1(2);
		boolean b = ot1 == ot2;
		System.out.println(ot1.test(ot2));
	}
}
