package Practice1;

import java.util.ArrayList;

public class C3 {
	public static void main(String[] args) {
		ArrayList ls=new ArrayList();
		ls.add(20);
		ls.add("Sheela");
		ls.add('A');
		ls.add(10.5);
		System.out.println(ls);
		System.out.println(ls.size());
		System.out.println(ls.isEmpty());
		for(int i=0;i<ls.size();i++) {
			System.out.println(ls.get(i));
		}
	}

}
