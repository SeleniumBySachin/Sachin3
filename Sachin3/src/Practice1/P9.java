package Practice1;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class P9 {
	public static void main(String[] args) {
		HashMap h=new HashMap();
		h.put("Penga","Pengi");
		h.put("Dinga", "Dingi");
		h.put("Romeo", "Juliet");
		h.put("Pekra","Pekri");
		System.out.println(h);
		Set c=h.keySet();
		for(Object o:c) {
			String s1=(String)o;
			System.out.print(s1+" : ");
			System.out.println(h.get(o));
		}
		System.out.println("=====================");
		Collection s1=h.values();
		Iterator i1=s1.iterator();{
			while(i1.hasNext()) {
				Object o1=i1.next();
				if(o1=="Dingi") {
					i1.remove();
				}
			}
			System.out.println(h);
		}
		System.out.println("========================");
		
		Iterator i=c.iterator();
		while(i.hasNext()) {
			Object s=i.next();
			if(s=="Romeo") {
				i.remove();
			}
		}
		System.out.println(h);
	}

}
