package Practice;

import java.util.Scanner;

public class S3 {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the no of elemens");
		int size=s.nextInt();
		int odd=0;
		int even=0;
		int []a=new int[size];
		System.out.println("Enter the elements");
		for(int i=0;i<a.length;i++) {
			a[i]=s.nextInt();
		}
		for(int i=0;i<a.length;i++) {
			if(i%2==0) {
				odd=odd+a[i];
			}
			else
				even=even+a[i];
		}
		System.out.println("The odd no sum is :"+odd);
		System.out.println("The even no sum is :"+even);
	}

}
