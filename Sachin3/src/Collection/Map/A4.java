package Collection.Map;

import java.util.HashMap;

public class A4 {
	public static void main(String[] args) {
		HashMap h=new HashMap();
		h.put(10,"Sheela");
		h.put(15, "Leela");
		h.put(12, "Dinga");
		h.put(20, "Penga");
		h.put(5, "Dingi");
		System.out.println(h);
		System.out.println(h.get(15));
		System.out.println(h.get(90));
	}

}
