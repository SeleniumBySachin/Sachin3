package Wrapper;

import java.util.ArrayList;
import java.util.Scanner;

public class P5 {
	public static void main(String[] args) {
		ArrayList ls=new ArrayList();
		Scanner s=new Scanner(System.in);
		System.out.println("Enter no emp");
		int size=s.nextInt();
		for(int i=0;i<size;i++) {
			System.out.println("Enter the eid");
			int eid=s.nextInt();
			s.nextLine();
			System.out.println("Enter the name");
			String name=s.nextLine();
			System.out.println("Enter emp sal");
			double sal=s.nextInt();
			Empolyee e1=new Empolyee(eid,name,sal);
			ls.add(e1);
		}
		System.out.println(ls);
		
		
	}

}
