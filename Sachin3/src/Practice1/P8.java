package Practice1;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.TreeMap;

public class P8 {
	public static void main(String[] args) {
		HashMap h=new HashMap();
		h.put("Penga","Pengi");
		h.put("Dinga", "Dingi");
		h.put("Romeo", "Juliet");
		h.put("Pekra","Pekri");
		System.out.println(h);
		System.out.println("==================");
		Hashtable h1=new Hashtable(h);
		h1.put(10, "Sheela");
		h1.put(20, "Leela");
		h1.put(30, "Dinga");
		h1.put(40,"Penga");
		System.out.println(h1);
	}

}
