package Practice1;

import java.util.ArrayList;

public class A {
	public static void main(String[] args) {
		ArrayList ls=new ArrayList();
		ls.add(10);
		ls.add(20);
		ls.add(30);
		ls.add(40);
		System.out.println(ls);
		Object[]o=ls.toArray();
		for(Object o1:o) {
			int a=(int)o1;
			System.out.println(o1);
			System.out.println("======");
			System.out.println(a);
		}
	}

}
