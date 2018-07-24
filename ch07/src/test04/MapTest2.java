package test04;

import java.util.HashMap;
import java.util.Iterator;

public class MapTest2 {

	public static void main(String[] args) {
		HashMap <String,String> map = new HashMap <String,String>();
		map.put("¿Ã∏ß", "∞≠πŒ«ı");
		map.put("≥™¿Ã", "19");
		map.put("¡÷º“", "∫Œ√µ");
		
		String name = map.get("¿Ã∏ß");
		String age = map.get("≥™¿Ã");
		String address = map.get("¡÷º“");
		System.out.println(name + "," + "age" + "," + address); 
		
		// ∏Ù∂Ûµµ µ  ------------------------------------
		Iterator<String> it = map.keySet().iterator();
		while(it.hasNext()) {
			String key = it.next();
			System.out.println(key);
			System.out.println(map.get(key));
		}
		// ∏Ù∂Ûµµ µ  ------------------------------------
	}
}
