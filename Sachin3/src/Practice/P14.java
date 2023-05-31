package Practice;

import java.util.ArrayList;
import java.util.Scanner;

public class P14 {
	public static void main(String[] args) {
		ArrayList ls=new ArrayList();
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the number");
		int num=s.nextInt();
		System.out.println("Enter the m value");
		int m=s.nextInt();
		System.out.println("Enter the n value");
		int n=s.nextInt();
		int count=0;
		for(int i=0;i<num;i++) {
			if(num%2==0) {
				count++;
				break;
			}
		}
		if(count==0) {
			ls.add(num+" : is an prime no");
		}
		
		System.out.println(ls);
	}

}
