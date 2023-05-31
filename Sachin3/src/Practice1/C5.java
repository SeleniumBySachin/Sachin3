package Practice1;

import java.util.ArrayList;

public class C5 {
	public static void main(String[] args) {
		ArrayList ls=new ArrayList();
		ls.add(10);
		ls.add(20);
		ls.add(30);
		ls.add(40);
		System.out.println(ls);
	    System.out.println(ls.contains(10));
	    ArrayList ls1=new ArrayList();
		ls1.add(15);
		ls1.add(25);
		ls1.add(35);
		ls1.add(45);
		System.out.println(ls1);
		System.out.println(ls.containsAll(ls1));
	}

}
