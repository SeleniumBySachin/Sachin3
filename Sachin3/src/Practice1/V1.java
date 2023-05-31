package Practice1;

import java.util.ArrayList;
import java.util.Iterator;

public class V1 {
	public static void main(String[] args) {
		ArrayList ls=new ArrayList();
		ls.add(20);
		ls.add(30);
		ls.add(40);
		ls.add(10);
		System.out.println(ls);
		Iterator i=ls.iterator();
		while(i.hasNext()) {
			System.out.println(i.next());
		}
		System.out.println("=========");
		for(Object o:ls) {
			int a=(int)o;
			if(a==10) {
				ls.set(ls.indexOf(a), 90);
			}
		}
		System.out.println(ls);
		System.out.println("============");
		while(i.hasNext()) {
			int a=(int)i.next();
			if(a==20) {
				i.remove();
			}
		}
		System.out.println(ls);
	}

}
