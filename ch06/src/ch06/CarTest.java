package ch06;

class Car {
	String color;       // ����
	String gearType;	// ���ӱ� ���� - auto(�ڵ�), manual(����)	
	int door;			// ���� ����
	
	Car() {}    // �⺻������
	Car(String c, String g, int d) {    // �Ķ��Ÿ�� 3���� ������
		color = c;
		gearType = g;
		door = d;
	}
}

class CarTest {
	public static void main(String[] args) {
		Car2 c1 = new Car2();
		c1.color = "white";
		c1.gearType = "auto";
		c1.door = 4;
		
		// �Ķ���� 3���� �����ڸ� �̿��Ͽ� ��ü�� ������ ���
		Car2 c2 = new Car2("white", "auto", 4);
		
		System.out.println("c1�� color=" + c1.color + ", gearType=" + c1.gearType + ", door=" + c1.door);
		System.out.println("c2�� color=" + c2.color + ", gearType=" + c2.gearType + ", door=" + c2.door);
	}
}
