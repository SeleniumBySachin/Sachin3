package Collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;

public class D11 {
	public static void main(String[] args) {
		ArrayList ls=new ArrayList();
		ls.add(10);
		ls.add(20);
		ls.add(30);
		ls.add(40);
		System.out.println(ls);
		System.out.println("==============");
		
		HashSet set=new HashSet(ls);
		System.out.println(set.size());
		System.out.println(set);
		System.out.println("=================");
		for(Object o:set) {
			System.out.println(o);
		}
		System.out.println("After sorting");
		ArrayList ls1=new ArrayList(set);
		Collections.sort(ls1);
		System.out.println(ls1);
	}

}
