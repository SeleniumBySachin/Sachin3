package Wrapper;

import java.util.ArrayList;

public class P10 {
	public static void main(String[] args) {
		ArrayList ls=new ArrayList();
		ls.add(10);
		ls.add(20);
		ls.add(30);
		ls.add(40);
		System.out.println(ls);
		ls.add(1,15);
		ls.add(3,25);
		System.out.println(ls);
	}

}
