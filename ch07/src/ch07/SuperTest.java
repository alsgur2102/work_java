package ch07;

class SuperTest {
	public static void main(String[] args) {
		Child c = new Child();
		c.x = 200;
		c.method();
	}
}

class Parent {
	int x = 10;
	
	// �⺻������
	Parent() {
		System.out.println("Parent �⺻������ ȣ��!");
	}
}

class Child extends Parent {
	
	// �⺻������
	Child() {
		System.out.println("Child �⺻������ ȣ��!");
	}
	
	void method() {
		System.out.println("x=" + x);
		System.out.println("this.x=" + this.x);
		System.out.println("suoer.x=" + super.x);
	}
}
