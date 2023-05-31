package Collection;

import java.util.ArrayList;

public class D3 {
	public static void main(String[] args) {
		ArrayList<Integer>ls=new ArrayList<>();
		ls.add(10);
		ls.add(20);
		ls.add(30);
		ls.add(40);
		System.out.println(ls);
		for(int o:ls) {
			if(o==30) {
				ls.set(ls.indexOf(o), 100);
			}
		}
		System.out.println(ls);
		
	}

}
