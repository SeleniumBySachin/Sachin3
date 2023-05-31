package String;

import java.util.Scanner;

public class D7 {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the string");
		String  size=s.nextLine();
		char[]ch=new char[size.length()];
		String s1="";
		for(int i=0;i<ch.length;i++) {
			ch[i]=size.charAt(i);
		}
		for(int i=0;i<ch.length;i++) {
			s1=ch[i]+s1;
		}
		for(int i=0;i<ch.length;i++) {
			System.out.println(ch[i]);
		}
		System.out.println(s1);
	}

}
