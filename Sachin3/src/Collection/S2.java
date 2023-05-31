package Collection;

import java.util.ArrayList;

public class S2 {
	public static void main(String[] args) {
		ArrayList ls=new ArrayList();
		ls.add("Sachin");
		ls.add("Sheela");
		ls.add("Leela");
		System.out.println(ls);
		System.out.println(ls.contains("Sachin"));
		
		ArrayList ls1=new ArrayList();
		ls1.add("sachin");
		ls1.add("Sheela");
		ls1.add("Leela");
		ls1.add(1,"Ding");
		System.out.println(ls1);
		System.out.println(ls.containsAll(ls1));
		
	}

}
