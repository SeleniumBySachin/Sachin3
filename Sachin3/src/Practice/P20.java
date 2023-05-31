package Practice;

import java.util.ArrayList;
import java.util.Scanner;

public class P20 {
	public static void main(String[] args) {
		ArrayList ls=new ArrayList();
		ls.add(10);
		ls.add(20);
		ls.add(30);
		ls.add(40);
		System.out.println(ls);
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the searching element");
		int key=s.nextInt();
		if(ls.contains(key)) {
			System.out.println(key+" :is present & index is: "+ls.indexOf(key));
		}
		else
	     System.out.println(key+" :is not present");
	}

}
