package Wrapper;

public class Empolyee {
	int eid;
	String name;
	double sal;
	Empolyee(){}
	public Empolyee(int eid, String name, double sal) {
		super();
		this.eid = eid;
		this.name = name;
		this.sal = sal;
	}
	public String toString() {
		return eid+"="+name+"="+sal;
	}

}
