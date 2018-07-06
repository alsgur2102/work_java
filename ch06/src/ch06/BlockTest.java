package ch06;

class BlockTest {
	static {	// Ŭ���� �ʱ�ȭ �� ( Ex) JDBC Driver �ڵ� ����)
		System.out.println("static { }");
	}

	{	// �ν��Ͻ� �ʱ�ȭ �� (��� ������ ������ ȣ���� ����)
		System.out.println("{ }");
		
		System.out.println("������ ȣ�� ������ ������ ���� �ڵ�");
		System.out.println("�����ڵ� 1");
	}

	public BlockTest() {
		System.out.println("������");
	}
	
	public BlockTest(String a) {
		System.out.println("������2");
	}

	public static void main(String[] args) {
		System.out.println("BlockTest bt = new BlockTest(); ");
		BlockTest bt = new BlockTest();

		System.out.println("BlockTest bt2 = new BlockTest(); ");
		BlockTest bt2 = new BlockTest();
		
		BlockTest bt3 = new BlockTest();		// ù��° ������ ȣ��
		BlockTest bt4 = new BlockTest("Hello"); // �ι�° ������ ȣ��
	}
}
