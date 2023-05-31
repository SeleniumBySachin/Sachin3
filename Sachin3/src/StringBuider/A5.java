package StringBuider;

import java.util.Scanner;

public class A5 {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the name");
		String name=s.nextLine();
		char[] ch=name.toCharArray();
		String s1="";
		for(int i=0;i<ch.length;i++) {
			s1=ch[i]+s1;
		}
		System.out.println(s1);
		
	}

}
