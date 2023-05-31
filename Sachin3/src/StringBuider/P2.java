package StringBuider;

import java.util.Scanner;

public class P2 {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the word");
		String s1=s.nextLine();
		char []ch=new char[s1.length()];
		int upp=0;
		int low=0;
		int num=0;
		int spl=0;
		for(int i=0;i<s1.length();i++) {
			ch[i]=s1.charAt(i);
			if(ch[i]>='A'&&ch[i]<='Z') {
				upp++;
			}
			else if(ch[i]>='a'&&ch[i]<='z') {
				low++;
			}
			else if(ch[i]>='0'&&ch[i]<='9') {
				num++;
			}
			else
				spl++;
		}
		System.out.println("UpperCase: "+upp);
		System.out.println("LowerCase: "+low);
		System.out.println("Digits: "+num);
		System.out.println("Spl char: "+spl);
		
		
		
	}

}
