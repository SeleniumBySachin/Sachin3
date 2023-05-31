package Practice;

import java.util.ArrayList;

public class P17 {
	public static void main(String[] args) {
		ArrayList ls=new ArrayList();
		ls.add(10);
		ls.add(20);
		ls.add(30);
		ls.add(40);
		System.out.println(ls);
		System.out.println(ls.contains(50));
		
		ArrayList ls1=new ArrayList();
		ls1.add(10);
		ls1.add(20);
		ls1.add(30);
		ls1.add(40);
		System.out.println(ls1);
		System.out.println(ls1.contains(10));
		System.out.println(ls.containsAll(ls1));
	}

}
