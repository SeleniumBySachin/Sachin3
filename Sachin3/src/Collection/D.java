package Collection;

import java.util.ArrayList;
import java.util.ListIterator;

public class D {
	public static void main(String[] args) {
		ArrayList ls=new ArrayList();
		ls.add(20);
		ls.add(10);
		ls.add(30);
		ls.add(40);
		System.out.println(ls);
		ListIterator i=ls.listIterator();
		while(i.hasNext()) {
			System.out.println(i.next());
		}
		System.out.println(ls);
		System.out.println("=================");
		while(i.hasPrevious()) {
			System.out.println(i.previous());
		}
		while(i.hasNext()) {
			int a=(int)i.next();
			if(a==20) {
				i.set(80);				
			}
		}
		
		System.out.println(ls);
		
	}

}
