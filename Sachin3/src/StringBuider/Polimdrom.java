package StringBuider;

import java.util.Scanner;

public class Polimdrom {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the ploimdrom char");
		String s1=s.nextLine();
		String s2="";
		String s3="";
		for(int i=0;i<s1.length();i++) {
			s2=s1.charAt(i)+s2;
		}
		if(s2.equals(s1)) {
			System.out.println("YES");
		}
		else
		{
			System.out.println("NO");
		}
		for(int i=s2.length()-1;i>s2.length()-3;i--) {
			s3=s1.charAt(i)+s3;
			
		}
		System.out.println(s3);
	}
}
	



