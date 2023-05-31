package Practice1;

import java.util.ArrayList;
import java.util.HashSet;

public class A4 {
	public static void main(String[] args) {
		HashSet s=new HashSet();
		s.add(10);
		s.add(20);
		s.add(30);
		s.add(40);
		System.out.println(s);
		System.out.println(s.size());
		s.add(30);
		System.out.println(s);
		System.out.println(s.size());
		System.out.println("==============");
		ArrayList ls=new ArrayList(s);
		System.out.println(ls);
		System.out.println(ls.size());
		for(int i=0;i<ls.size();i++) {
			System.out.println(ls.get(i));
		}
		System.out.println(ls.indexOf(30));

	}

}
