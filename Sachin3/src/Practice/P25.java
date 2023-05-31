package Practice;

import java.util.ArrayList;

public class P25 {
	public static void main(String[] args) {
		ArrayList ls=new ArrayList();
		ls.add('A');
		ls.add('B');
		ls.add('C');
		ls.add('D');
		System.out.println(ls);
		ls.remove(Character.valueOf('D'));
		System.out.println(ls);
	}

}
