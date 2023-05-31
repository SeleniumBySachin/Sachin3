package Collection;

import java.util.ArrayList;

public class D6 {
	public static void main(String[] args) {
		ArrayList ls=new ArrayList();
		ls.add(10);
		ls.add(20);
		ls.add(30);
		ls.add(40);
		System.out.println(ls);
		System.out.println("==============");
		Object[]a=ls.toArray();
		for(Object b:a) {
			int c=(int)b;
			System.out.println(c);
		}
		
	}

}
