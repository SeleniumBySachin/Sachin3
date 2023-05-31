package Practice1;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;

public class S7 {
	public static void main(String[] args) {
		HashMap h=new HashMap();
		h.put(10, "Sheela");
		h.put(20,"Leeela");
		h.put(30, "Dinga");
		h.put(40, "Dinga");
		System.out.println(h);
		Collection c=h.entrySet();
		Iterator i=c.iterator();
		while(i.hasNext()) {
			System.out.println(i.next());
		}
	}

}
