package Practice1;

import java.util.Scanner;

public class S6 {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the no of elements to store");
		int a=s.nextInt();
		int largest1=0;
		int largest2=0;
		int largest3=0;
		int[]b=new int[a];
		System.out.println("Enter the elements");
		for(int i=0;i<b.length;i++) {
			b[i]=s.nextInt();
		}
		for(int i=0;i<b.length;i++) {
			if(b[i]>largest1) {
				largest2=largest1;
				largest1=b[i];
			}
		}
		System.out.println("Largest1 elements is : "+largest1);
		System.out.println("Largest 2 : "+largest2);
		System.out.println("Largest 3 :"+largest3);
	}

}
