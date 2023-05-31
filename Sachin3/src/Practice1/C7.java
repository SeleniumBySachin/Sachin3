package Practice1;

import java.util.ArrayList;

public class C7 {
	public static void main(String[] args) {
		ArrayList ls=new ArrayList();
		ls.add(10);
		ls.add(20);
		ls.add(30);
		ls.add(40);
		System.out.println(ls);
		System.out.println(ls.indexOf(20));
		ArrayList ls1=new ArrayList();
		ls1.add(10);
		ls1.add(40);
		ls1.add(25);
		ls1.add(70);
		ls.retainAll(ls1);
		System.out.println(ls);
		ls.clear();
		System.out.println(ls);
		
	}

}
