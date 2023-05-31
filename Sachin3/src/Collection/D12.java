package Collection;

import java.util.Iterator;
import java.util.TreeSet;

public class D12 {
	public static void main(String[] args) {
		TreeSet t1=new TreeSet();
		t1.add(30);
		t1.add(10);
		t1.add(40);
		t1.add(20);
		t1.add(25);
		System.out.println(t1);
		System.out.println(t1.descendingSet());
		System.out.println("===============");
		Iterator i=t1.descendingIterator();
		while(i.hasNext()) {
			System.out.println(i.next());
		}
		
	}

}
