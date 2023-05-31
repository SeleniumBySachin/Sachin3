package Collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
class SortBySal implements Comparator{
	

	public int compare(Object o1,Object o2) {
		Employee s1=(Employee)o1;
		Employee s2=(Employee)o2;
		return s1.name.compareTo(s2.name);
		
	}
}
class Employee {
	int eid;
	String name;
	double sal;
	Employee(){}
	@Override
	public String toString() {
		return "Employee [eid=" + eid + ", name=" + name + ", sal=" + sal + "]";
	}
	public Employee(int eid, String name, double sal) {
		super();
		this.eid = eid;
		this.name = name;
		this.sal = sal;
	}
}
public class Driver4 {
	public static void main(String[] args) {
		ArrayList ls=new ArrayList();
		ls.add(new Employee(103,"Sheela",50000));
		ls.add(new Employee(104,"Leela",10000));
		ls.add(new Employee(102,"Dinga",20000));
		ls.add(new Employee(101,"Arun",5000));
		System.out.println("Before sorting");
		System.out.println(ls);
		System.out.println("After sorting");
		Collections.sort(ls,new SortBySal());
		for(int i=0;i<ls.size();i++) {
			System.out.println(ls.get(i));
		}
		
	}

}
