package Collection.Map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class A1 {
	public static void main(String[] args) {
		HashMap h=new HashMap();
		h.put(10,"Sheela");
		h.put(15, "Leela");
		h.put(12, "Dinga");
		h.put(20, "Penga");
		h.put(5, "Dingi");
		System.out.println(h);
		HashMap h1=new HashMap();
		h1.put(13,"Channa");
		h1.put(14, "Arun");
		h1.put(116, "Prithvin");
		h1.put(25, "Shbz");
		h1.put(6, "Prajwal");
		System.out.println(h1);
		h.putAll(h1);;
		System.out.println(h);
		System.out.println(h1.isEmpty());
		System.out.println(h1.size());
		
	}

}
