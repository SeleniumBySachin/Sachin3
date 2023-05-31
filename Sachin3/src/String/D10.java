package String;

import java.util.Scanner;

public class D10 {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter your favourite colour");
		String s1=s.nextLine();
		System.out.println("Your colour is: "+s1);
		String s2="";
		for(int i=s1.length()-1;i>s1.length()-3;i--) {
			s2=s1.charAt(i)+s2;
		}
		System.out.println(s2);
	}

}
