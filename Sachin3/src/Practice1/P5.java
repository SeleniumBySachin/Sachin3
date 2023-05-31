package Practice1;

import java.util.HashMap;

public class P5 {
	public static void main(String[] args) {
		HashMap h=new HashMap();
		h.put(10, "Sheela");
		h.put(20, "Leela");
		h.put(30, "Dinga");
		h.put(40,"Penga");
		System.out.println(h);
		System.out.println(h.values());
		System.out.println(h.keySet());
		System.out.println(h.entrySet());
	}

}
