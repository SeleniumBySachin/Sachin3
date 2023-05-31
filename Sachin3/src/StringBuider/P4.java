
package StringBuider;

import java.util.Scanner;

public class P4 {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the word");
		String s1=s.nextLine();
		char ch=0;
		int upp=0;
		int low=0;
		int num=0;
		int spl=0;
		for(int i=0;i<s1.length();i++) {
			ch=s1.charAt(i);
			if(ch>='A'&&ch<='Z') {
				upp++;
			}
			else if(ch>='a'&&ch<='z') {
				low++;
			}
			else if(ch>='0'&&ch<='9') {
				num++;
			}
			else
				spl++;
		}
		System.out.println("UpperCase: "+upp);
		System.out.println("LowerCase: "+low);
		System.out.println("Digits: "+num);
		System.out.println("Spl char: "+spl);
		System.out.println(ch);
		
		
}

}
