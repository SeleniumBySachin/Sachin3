package Practice1;

import java.util.ArrayList;
import java.util.Collections;

public class A3 {
	public static void main(String[] args) {
		ArrayList ls=new ArrayList();
		ls.add(30);
		ls.add(10);
		ls.add(40);
		ls.add(20);
		System.out.println("Before sorting");
		System.out.println(ls);
		System.out.println("After sorting");
		Collections.sort(ls);
		System.out.println(ls);
		ArrayList ls1=new ArrayList();
		ls1.add("Sheela");
		ls1.add("Leela");
		ls1.add("Arun");
		ls1.add("Bhanu");
		System.out.println("==================");
		System.out.println("Before sorting");
		System.out.println(ls1);
		System.out.println("Afer sorting");
		Collections.sort(ls1);;
		for(Object o:ls1) {
			String s=(String)o;
			System.out.println(s+" length of char is: "+s.length());
		}
		System.out.println("===================");
		ArrayList ls2=new ArrayList();
		ls2.add('C');
		ls2.add('A');
		ls2.add('b');
		ls2.add('e');
		ls2.add('E');
		System.out.println("Before sorting");
		System.out.println(ls2);
		System.out.println("After sorting");
		Collections.sort(ls2);
		System.out.println(ls2);
	}

}
