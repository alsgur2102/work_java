package test04;

import java.util.HashMap;
import java.util.Iterator;

public class MapTest2 {

	public static void main(String[] args) {
		HashMap <String,String> map = new HashMap <String,String>();
		map.put("�̸�", "������");
		map.put("����", "19");
		map.put("�ּ�", "��õ");
		
		String name = map.get("�̸�");
		String age = map.get("����");
		String address = map.get("�ּ�");
		System.out.println(name + "," + "age" + "," + address); 
		
		// ���� �� ------------------------------------
		Iterator<String> it = map.keySet().iterator();
		while(it.hasNext()) {
			String key = it.next();
			System.out.println(key);
			System.out.println(map.get(key));
		}
		// ���� �� ------------------------------------
	}
}
