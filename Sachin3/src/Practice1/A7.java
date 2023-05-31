package Practice1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.TreeSet;

public class A7 {
	public static void main(String[] args) {
		int[]a= {20,10,40,30};
		//Arrays.sort(a);
		ArrayList ls=new ArrayList();
		for(int b:a) {
			ls.add(b);
		}
		TreeSet t=new TreeSet(ls);
		System.out.println(t);
		System.out.println(t.descendingSet());
	}

}
