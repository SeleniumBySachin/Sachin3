package Collection;

import java.util.ArrayList;

public class S8 {
	public static void main(String[] args) {
		ArrayList ls=new ArrayList();
		ls.add(10);
		ls.add(20);
		ls.add(30);
		ls.add(40);
		System.out.println(ls);
		System.out.println(ls.remove(1));
		System.out.println(ls);
		ls.clear();
		System.out.println(ls);
	}

}
