package Collection;

import java.util.ArrayList;
import java.util.ListIterator;

public class P6 {
	public static void main(String[] args) {
		ArrayList ls=new ArrayList();
		ls.add(10);
		ls.add(20);
		ls.add(30);
		ls.add(40);
		System.out.println(ls);
		ListIterator i=ls.listIterator();
		while(i.hasNext()) {
			System.out.println(i.next());
			i.remove();
			}
		System.out.println(ls);
	}

}
