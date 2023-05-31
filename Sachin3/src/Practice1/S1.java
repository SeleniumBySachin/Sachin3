package Practice1;

import java.util.Scanner;

public class S1 {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the elements you want to store");
		int size=s.nextInt();
		int[]b=new int[size];
		System.out.println("Enter the elements");
		for(int i=0;i<b.length;i++) {
			b[i]=s.nextInt();
		}
		System.out.println("The array elements are : ");
		for(int i=0;i<b.length;i++) {
			System.out.println(b[i]);
		}
	}

}
