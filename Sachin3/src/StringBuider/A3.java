package StringBuider;

import java.util.Scanner;

public class A3 {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the name");
		String name=s.nextLine();
		String s1="";
		for(int i=name.length()-1;i>=name.length()-2;i--) {
			s1=name.charAt(i)+s1;
		}
		System.out.println(s1);
	}

}
