package test02;

public class ObjectTest2 {
	public int num = 10;
	public String str = "abc";
	
	public ObjectTest2(int num, String str) {
		this.num = num;
		this.str = str;
	}
	public String toString() {
		return this.num + "," + this.str;
	}

	public static void main(String[] args) {
		
	}
}
