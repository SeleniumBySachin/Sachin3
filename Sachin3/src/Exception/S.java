package Exception;

public class S {
	int eid;
	String name;
	double sal;
	S(){}
	public S(int eid, String name, double sal) {
		super();
		this.eid = eid;
		this.name = name;
		if(sal>0) {
			this.sal=sal;
		}
		else {
			throw new NegativeSalaryException();
		}
			}
		void display() {
			System.out.println("The emp id: "+eid);
			System.out.println("The emp salary: "+sal);
			System.out.println("The emp name: "+name);
		
	}
	

}
