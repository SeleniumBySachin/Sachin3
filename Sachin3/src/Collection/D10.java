package Collection;

import java.util.HashSet;
import java.util.Iterator;

public class D10 {
	public static void main(String[] args) {
		HashSet set=new HashSet();
		set.add(10);
		set.add(20);
		set.add(30);
		set.add(40);
		System.out.println(set.size());
		System.out.println(set);
		System.out.println("===============");
		set.add(40);
		System.out.println(set.size());
		System.out.println(set);
	      Iterator j=set.iterator();
	   while(j.hasNext()) {
		   System.out.println(j.next());
	   }
	}

}
