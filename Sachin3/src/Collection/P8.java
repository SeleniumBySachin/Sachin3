package Collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class P8 {
	public static void main(String[] args) {
		ArrayList ls=new ArrayList();
		ls.add(10);
		ls.add(20);
		ls.add(30);
		ls.add(40);
		System.out.println(ls);
		System.out.println("======================");
		ListIterator i1=ls.listIterator();
		while(i1.hasNext()) {
			System.out.println(i1.next());
		}
		System.out.println("++++++++++++++");
		i1.add(50);
		while(i1.hasPrevious()) {
			System.out.println(i1.previous());
		}
		
		while(i1.hasNext()) {
			int a=(int)i1.next();
			if(a==20) {
			i1.set(25);
			}
		}
		System.out.println(ls);
	}

}
