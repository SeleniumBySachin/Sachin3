package Exception;

public class Custom {
	int eid;
	String name;
	double sal;
	Custom(){}
	public Custom(int eid, String name, double sal)throws Exception {
		super();
		this.eid = eid;
		this.name = name;
		if(sal>0) {
			this.sal = sal;
		}
		else
			throw new NegativeSalException();
	}
	void display() {
		System.out.println("The emp id: "+eid);
		System.out.println("The emp salary: "+sal);
		System.out.println("The emp name: "+name);
	}
	
}
