package Practice1;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.TreeSet;

public class A9 {
	public static void main(String[] args) {
		String []s1= {"Sheela","Leela","Arun","Channa","Arun","Bhanu","Sheela"};

		ArrayList ls=new ArrayList();
		for(String b:s1) {
			ls.add(b);
		}
		System.out.println(ls);
		HashSet s=new HashSet(ls);
		System.out.println(s);
		TreeSet t=new TreeSet(s);
		System.out.println(t);
		System.out.println(t.descendingSet());
		System.out.println("=============================");
		Iterator i=t.descendingIterator();
		while(i.hasNext()) {
			System.out.println(i.next());
		}
		
	}

}
