package Practice;

import java.util.Scanner;

public class S2 {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the no of elements to store");
		int a=s.nextInt();
		int sum=0;
		int []b=new int[a];
		System.out.println("Enter the elements");
		for(int i=0;i<b.length;i++) {
			b[i]=s.nextInt();
		}
		for(int i=0;i<b.length;i++) {
			sum=sum+b[i];
		}
		int avg=sum/a;
		System.out.println("The sum of array elements are :"+sum);
		System.out.println("The avg of array is :"+avg);
	}

}
