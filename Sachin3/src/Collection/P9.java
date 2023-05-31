package Collection;

import java.util.ArrayList;

public class P9 {
	public static void main(String[] args) {
		ArrayList ls=new ArrayList();
		ls.add(10);
		ls.add(20);
		ls.add(30);
		ls.add(40);
		System.out.println(ls);
		System.out.println("======================");
		for (Object o:ls) {
			System.out.println(o);
		}
	}

}
