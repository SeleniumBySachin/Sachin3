package Practice1;

import java.util.ArrayList;
import java.util.ListIterator;

public class S10 {
	public static void main(String[] args) {
		ArrayList ls=new ArrayList();
		ls.add(10);
		ls.add(20);
		ls.add(30);
		ls.add(40);
		System.out.println(ls);
		ListIterator i=ls.listIterator();
		while(i.hasNext()) {
			int a=(int)i.next();
			if(a==40) {
				i.set(50);;
			}
		}
		System.out.println(ls);
		for(Object o:ls) {
			ls.set(2, 200);
		}
		System.out.println(ls);
	}

}
