package Practice;

import java.util.ArrayList;
import java.util.Scanner;

public class P12 {
	public static void main(String[] args) {
		ArrayList ls=new ArrayList();
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the element size");
		int size=s.nextInt();
		System.out.println("Enter the elements");
		for(int i=0;i<size;i++) {
			ls.add(s.nextInt());
		}
		System.out.println("The array list elements are: "+ls);
		
		
	}

}
