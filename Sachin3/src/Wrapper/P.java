package Wrapper;

import java.util.Scanner;

public class P {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the character");
		char ch=s.next().charAt(0);
		System.out.println(ch);
		System.out.println("Enter the second character");
		int a=s.next().charAt(0);
		System.out.println(a);
	}

}