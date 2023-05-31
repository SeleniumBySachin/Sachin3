package Practice1;

import java.util.HashMap;

public class P1 {
	public static void main(String[] args) {
		HashMap h=new HashMap();
		h.put(10, "Sheela");
		h.put(20, "Leela");
		h.put(30, "Dinga");
		h.put(40,"Penga");
		System.out.println(h);
		System.out.println(h.size());
		h.put(10, "Pengi");
		System.out.println(h);
		System.out.println(h.isEmpty());
		
	}

}
