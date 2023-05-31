package Collection;

import java.util.ArrayList;

public class D5 {
	public static void main(String[] args) {
		ArrayList<String>ls=new ArrayList<>();
		ls.add("Sheela");
		ls.add("Leela");
		ls.add("Dinga");
		ls.add("Dingi");
		System.out.println(ls);
		
		for(int i=0;i<ls.size();i++) {
			String s=ls.get(i);
			System.out.println(ls.get(i)+" & its length is: "+s.length());
		}
	}

}
