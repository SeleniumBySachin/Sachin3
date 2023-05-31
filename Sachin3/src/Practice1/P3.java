package Practice1;

import java.util.HashMap;

public class P3 {
	public static void main(String[] args) {
		HashMap h=new HashMap();
		h.put(10, "Sheela");
		h.put(20, "Leela");
		h.put(30, "Dinga");
		h.put(40,"Penga");
		System.out.println(h);
		System.out.println(h.containsKey(10));
		System.out.println(h.containsKey(50));
		System.out.println("=================");
		System.out.println(h.containsValue("Sheela"));
		System.out.println(h.containsValue("Pengi"));
	}

}
