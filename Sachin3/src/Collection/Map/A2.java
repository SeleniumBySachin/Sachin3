package Collection.Map;

import java.util.HashMap;
import java.util.Map;

public class A2 {
	public static void main(String[] args) {
		HashMap h=new HashMap();
		h.put(10,"Sheela");
		h.put(15, "Leela");
		h.put(12, "Dinga");
		h.put(20, "Penga");
		h.put(5, "Dingi");
		System.out.println(h);
		//to check passed key present or not
		System.out.println(h.containsKey(10));
		System.out.println(h.containsKey(30));
		//to check passed values present or not
		System.out.println(h.containsValue("Sheela"));
		System.out.println(h.containsValue("Channa"));
		
	}

}
