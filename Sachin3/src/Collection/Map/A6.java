package Collection.Map;

import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeMap;

public class A6 {
	public static void main(String[] args) {
		TreeMap h=new TreeMap();
		h.put(10,"Sheela");
		h.put(15, "Leela");
		h.put(12, "Dinga");
		h.put(20, "Penga");
		h.put(5, "Dingi");
		System.out.println(h);
		Set s=h.keySet();
		for(Object o:s) {
			
			System.out.print(o+" : ");
			System.out.println(h.get(o));
		}
		Collection s1=h.entrySet();
		Iterator i=s1.iterator();
		while(i.hasNext()) {
			System.out.println(i.next());
		}
		Collection s2=h.values();
		Iterator i1=s2.iterator();
		while(i1.hasNext()) {
			System.out.println(i1.next());
		}
	}

}
