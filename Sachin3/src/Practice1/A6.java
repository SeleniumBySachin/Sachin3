package Practice1;

import java.util.ArrayList;
import java.util.ListIterator;
import java.util.TreeSet;

public class A6 {
	public static void main(String[] args) {
		ArrayList ls=new ArrayList();
		ls.add(20);
		ls.add(30);
		ls.add(40);
		ls.add(10);
		System.out.println(ls);
		TreeSet t=new TreeSet(ls);
		System.out.println(t);
		System.out.println(t.descendingSet());
		System.out.println("==================");
		ListIterator i=ls.listIterator();
		while(i.hasNext()) {
			int a=(int)i.next();
			if(a==10) {
				i.remove();
			}
		}
		/*Iterator i1=ls.iterator();
		for(Object o:t) {
			int a=(int)o;
			if(a==20) {
				ls.add(100);
				ls.set(3, 200);
			}
		}*/
		System.out.println(ls);
	}

}
