package Collection;

import java.util.ArrayList;

public class P10 {
	public static void main(String[] args) {
		ArrayList ls=new ArrayList();
		ls.add(10);
		ls.add(20);
		ls.add(30);
		ls.add(40);
		System.out.println(ls);
		System.out.println("======================");
		for(Object o:ls) {
			int a=(int)o;
			if(a==20) {
				ls.set(ls.indexOf(a), 50);
			}
		}
		System.out.println(ls);
	}

}
