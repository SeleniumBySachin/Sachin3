package Practice1;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class P2 {
	public static void main(String[] args) {
		HashMap h=new HashMap();
		h.put(10, "Sheela");
		h.put(20, "Leela");
		h.put(30, "Dinga");
		h.put(40,"Penga");
		System.out.println(h);
		HashMap h1=new HashMap();
		h1.put(15, "Arun");
		h1.put(25, "Mahesh");
		h1.put(35, "Channa");
		h1.put(45, "Harish");
		System.out.println(h1);
		h.putAll(h1);
		Set s=h.entrySet();
		Iterator i=s.iterator();
		while(i.hasNext()) {
			System.out.println(i.next());
		}
	}
}
