package StringBuider;

import java.util.Scanner;

public class A4 {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the name");
		String name=s.nextLine();
		String s1="";
		for(int i=name.length()-1;i>=0;i--) {
			s1=s1+name.charAt(i);
		}
		System.out.println(s1);
	}

}
