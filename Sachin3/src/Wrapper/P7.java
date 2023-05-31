package Wrapper;

import java.util.ArrayList;
import java.util.Scanner;

public class P7 {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);	
		ArrayList ls=new ArrayList();
		System.out.println("Enter the num value");
		int num=s.nextInt();
		System.out.println("Enter the m value");
		int m=s.nextInt();
		System.out.println("Enter the n value");
		int n=s.nextInt();
		int count=0;
		for(int i=m;i<n;i++) {
			if(num%i==0) {
				count++;
				break;
			}
		}
		if(count==0) {
			ls.add(num+" is a prime no");
		}
		else {
			ls.add(num+" is not a prime no");
		}
		System.out.println(ls);
		
		
	}

}
