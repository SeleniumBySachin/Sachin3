package StringBuider;

import java.util.Scanner;

public class P1 {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter your polindrom no");
		String s1=s.nextLine();
		String s2="";
		for(int i=0;i<s1.length();i++) {
			s2=s1.charAt(i)+s2;
		}
		System.out.println(s2);
		if(s1.equals(s2)) {
			System.out.println(s2+": it is an polindrom");
		}
		else
			System.out.println(s2+": it is not an polindrom");
	}

}
