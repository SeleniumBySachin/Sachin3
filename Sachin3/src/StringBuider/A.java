package StringBuider;

import java.util.Scanner;

public class A {

	public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter city name");
        String city=s.nextLine();
        System.out.println("Enter the area");
        String area=s.nextLine();
        char ch=area.charAt(0);
        String s2=ch+"";
        if (city.contains(s2)) {
        	System.out.println("Hello");
        }
        else
        	System.out.println("Bye");
      
	}

}
