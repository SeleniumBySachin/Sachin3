package Wrapper;

import java.util.ArrayList;

public class P8 {
	public static void main(String[] args) {
		ArrayList ls=new ArrayList();
		ls.add(10);
		ls.add(20);
		ls.add(30);
		ls.add(40);
		System.out.println(ls);
		
		ArrayList ls1=new ArrayList();
		ls1.add(15);
		ls1.add(25);
		ls1.add(35);
		ls1.add(45);
		System.out.println(ls1);
		boolean a=ls.addAll(ls1);
		System.out.println(a);
		System.out.println(ls.size());
		System.out.println(ls.isEmpty());
		System.out.println("------------");
		System.out.println(ls1.size());
		System.out.println(ls1.isEmpty());
		System.out.println(ls);
	}

}
