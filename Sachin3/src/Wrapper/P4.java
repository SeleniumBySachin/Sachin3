package Wrapper;

import java.util.ArrayList;
import java.util.Scanner;

public class P4 {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		ArrayList ls=new ArrayList();
		System.out.println("Enter the size of the collection");
		int size=s.nextInt();
		System.out.println("Enter element");
		int []a=new int[size];
		for(int i=0;i<a.length;i++) {
			a[i]=s.nextInt();
			}
		for(int i=0;i<a.length;i++) {
			ls.add(a[i]);
		}
		System.out.println(ls);
	}

}
