package Collection;

import java.util.ArrayList;
import java.util.ListIterator;

public class D4 {
	public static void main(String[] args) {
		ArrayList<Integer>ls=new ArrayList<>();
		ls.add(10);
		ls.add(20);
		ls.add(30);
		ls.add(40);
		System.out.println(ls);
		ListIterator i=ls.listIterator();
		while(i.hasNext()) {
			Object o=i.next();
			int a=(int)o;
			if(a==40) {
				i.add(100);
			}
		}
		System.out.println(ls);
	}

}
