package Collection;

import java.util.ArrayList;
import java.util.ListIterator;

public class D2 {
	public static void main(String[] args) {
		ArrayList ls=new ArrayList();
		ls.add(20);
		ls.add(10);
		ls.add(30);
		ls.add(40);
		System.out.println(ls);
		System.out.println("================");        
	ListIterator i=ls.listIterator();
	while(i.hasNext()) {
		int a=(int)i.next();
		if(a==20) {
			i.add(90);
		}
	}
		System.out.println(ls);
}

}
