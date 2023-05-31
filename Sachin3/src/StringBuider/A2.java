package StringBuider;

import java.io.InputStream;
import java.util.Scanner;

public class A2 {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the colour");
		String colour=s.nextLine();
		char[]ch=colour.toCharArray();
		String s1="";
		for(int i=ch.length-1;i>ch.length-3;i--) {
			s1=ch[i]+s1;
		}
		System.out.println("Last two char is: "+s1);
		
	}

}
