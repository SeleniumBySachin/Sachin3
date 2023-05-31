package StringBuider;

import java.util.Arrays;
import java.util.Scanner;

public class Sort {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the string");
		String s1=s.nextLine();
		char[] ch=s1.toCharArray();
		char[]s2=new char[s1.length()];
		for(int i=0;i<s2.length;i++) {
			s2[i]=s1.charAt(i);
		}
		Arrays.sort(s2);
		Arrays.sort(ch);
		System.out.println(s2);
	     String s3="";
	     for(int i=0;i<s2.length;i++) {
	     }
	    
	    
	}

}
