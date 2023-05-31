package Collection;

import java.util.ArrayList;
import java.util.Collections;

class Student implements Comparable{
	int sid;
	String name;
	Student(){}
	public Student(int sid, String name) {
		super();
		this.sid = sid;
		this.name = name;
	}
	@Override
	public String toString() {
		return "Student [sid=" + sid + ", name=" + name + "]";
	}
	public int compareTo(Object o) {
		Student s1=(Student)o;
		if(this.sid>s1.sid)
			return 1;
		if(this.sid<s1.sid) 
		return -1;
		else
			return 0;
		
	}
}
public class Driver3 {
	public static void main(String[] args) {
		ArrayList ls=new ArrayList();
		ls.add(new Student(104,"Sheela"));
		ls.add(new Student(103,"Leela"));
		ls.add(new Student(101,"Dinga"));
		ls.add(new Student(102,"Penga"));
		System.out.println("Before sorting");
		System.out.println(ls);
		Collections.sort(ls);
		System.out.println("After sorting");
		for(int i=0;i<ls.size();i++) {
			System.out.println(ls.get(i));
		}
	}

}
