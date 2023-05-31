package String;

import java.util.Scanner;

public class D9 {
	public static void main(String[] args) {
		Scanner s1=new Scanner(System.in);
		System.out.println("Enter the city");
		String city=s1.nextLine();
		System.out.println("Enter area name");
		String area=s1.nextLine();
		//char []ch1=area.toCharArray();
		char ch=area.charAt(0);
		//String s2=ch1[0]+"";
		String s2=ch+"";
		if(city.contains(s2)) {
			System.out.println("YES");
		}
		else
			System.out.println("NO");
	}

}
