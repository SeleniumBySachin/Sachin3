package Collection;

import java.util.ArrayList;

public class D8 {
	public static void main(String[] args) {
		ArrayList ls=new ArrayList();
		ls.add(10);
		ls.add(20);
		ls.add(30);
		ls.add(40);
		System.out.println(ls);
		Object[]o=ls.toArray();
		for(Object a:o) {
			System.out.println(a);
			
		}
		System.out.println("=============");
		int[]c= {20,10,40,50};
		ArrayList ls1=new ArrayList();
		for(Object o1:c) {
		   ls1.add(o1);
		}
		System.out.println(ls1.size());
		System.out.println(ls1);
	}

}
