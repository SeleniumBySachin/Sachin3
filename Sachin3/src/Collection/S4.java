package Collection;

import java.util.ArrayList;
import java.util.Scanner;

public class S4 {
	public static void main(String[] args) {
		ArrayList ls=new ArrayList();
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the size of collection");
		int size=s.nextInt();
		System.out.println("Enter the elements into collection");
		for(int i=0;i<size;i++) {
			ls.add(s.nextInt());
		}
		System.out.println("Enter the searching element");
		int key=s.nextInt();
		if(ls.contains(key)) {
			System.out.println(key+" is present inside collection & index is: "+ls.indexOf(key));
		}
		else
			System.out.println(key+" is not present inside collection");
		
	}
	

}
