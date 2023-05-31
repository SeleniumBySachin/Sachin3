package Practice1;

import java.util.HashMap;
import java.util.TreeMap;

public class P6 {
	public static void main(String[] args) {
		HashMap h=new HashMap();
		h.put("Penga","Pengi");
		h.put("Dinga", "Dingi");
		h.put("Romeo", "Juliet");
		h.put("Pekra","Pekri");
		System.out.println(h);
		TreeMap h1=new TreeMap(h);
		System.out.println(h1);
		
	}

}
