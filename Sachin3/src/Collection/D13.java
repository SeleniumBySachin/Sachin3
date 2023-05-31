package Collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.TreeSet;

public class D13 {
	public static void main(String[] args) {
		ArrayList ls=new ArrayList();
		ls.add(20);
		ls.add(30);
		ls.add(40);
		ls.add(10);
		System.out.println(ls);
		TreeSet t=new TreeSet(ls);
		System.out.println(t.size());
		System.out.println(t);
		for(Object o:t) {
			System.out.println(o);
		}
		System.out.println("=========");
		Iterator i=t.iterator();
		while(i.hasNext()) {
			System.out.println(i.next());
		}
		
	}

}
