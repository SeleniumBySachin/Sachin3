package StringBuider;

import java.util.Scanner;

public class CountUpper {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the name");
		String s1=s.nextLine();
		
		int upp,low,dig,spl=0;
		upp=0;
		low=0;
		dig=0;
		char ch=0;
		for(int i=0;i<s1.length();i++) {
			ch=s1.charAt(i);
		
		if(ch>='A'&&ch<='Z') {
			upp++;
		}
		else if(ch>='a'&&ch<='z') {
			low++;
		}
		else if(ch>='0'&&ch<='9') {
			dig++;
		}
		else {
			spl++;
		}
		}
		System.out.println("Uppercase: "+upp);
		System.out.println("Lowercase: "+low);
		System.out.println("Digit: "+dig);
		System.out.println("Spl: "+spl);
	}
	}


