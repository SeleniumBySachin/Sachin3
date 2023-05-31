package Practice1;

import java.util.ArrayList;
import java.util.List;

public class A2 {
	public static ArrayList toList(int[] a) {
		ArrayList ls=new ArrayList();
		for(Object o:a) {
			ls.add(o);
		}
		return ls;
	}
	public static void main(String[] args) {
		int[]a= {10,20,30,40};
		ArrayList ls=toList(a);
		System.out.println(ls);
	}

}
