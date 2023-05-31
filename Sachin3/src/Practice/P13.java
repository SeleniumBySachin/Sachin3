package Practice;

import java.util.ArrayList;
import java.util.Scanner;

class Emp{
	int eid;
	String name;
	double sal;
	Emp(){}
	public Emp(int eid, String name, double sal) {
		super();
		this.eid = eid;
		this.name = name;
		this.sal = sal;
	}
	public String toString() {
		return "Eid: "+eid+"Name: "+name+"Sal: "+sal;
	}
}
public class P13 {
	public static void main(String[] args) {
		ArrayList ls=new ArrayList();
		Scanner s=new Scanner(System.in);
		System.out.println("Enter how many emp do you want to store");
		int size=s.nextInt();
		for(int i=0;i<size;i++) {
			System.out.println("Enter the emp id");
			int eid=s.nextInt();
			s.nextLine();
			System.out.println("Enter the emp name");
			String name=s.nextLine();
			System.out.println("Enter the emp sal");
			double sal=s.nextDouble();
			Emp e1=new Emp(eid,name,sal);
			ls.add(e1);
		}
		System.out.println(ls);
		
	}

}
