package Collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class D9 {
	public static void main(String[] args) {
		ArrayList ls=new ArrayList();
		ls.add(50);
		ls.add(30);
		ls.add(20);
		ls.add(10);
		ls.add(40);
		System.out.println("Before sorting");
		System.out.println(ls);
		System.out.println("After sorting");
		Collections.sort(ls);
		System.out.println(ls);
	}

}
