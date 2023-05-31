package Practice1;

import java.util.Scanner;

public class S5 {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the no of elements to store");
		int a=s.nextInt();
		int largest=0;
		int[]b=new int[a];
		System.out.println("Enter the elements");
		for(int i=0;i<b.length;i++) {
			b[i]=s.nextInt();
		}
		for(int i=0;i<b.length;i++) {
			if(b[i]>largest) {
				largest=b[i];
			}
		}
		System.out.println("Largest elements is : "+largest);
	}

}
