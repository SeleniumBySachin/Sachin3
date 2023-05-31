package Collection;

import java.util.ArrayList;
import java.util.Scanner;

public class A3 {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		ArrayList ls=new ArrayList();
		System.out.println("Enter the size of the collection");
		int a=s.nextInt();
		System.out.println("Enter element");
		for(int i=0;i<a;i++) {
			ls.add(s.nextInt());
		}
		System.out.println(ls);
		
	}

}
