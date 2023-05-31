package ObjectClass;

public class A {
	int acno;
	double bal;
	String name;
	
	A(){}

	public A(int acno, double bal,String name) {
		super();
		this.acno = acno;
		this.bal = bal;
		this.name=name;
	}

	@Override
	public String toString() {
		return "acno: "+acno+"\nbal"+bal+"\nname"+name;
	}
	public boolean equals(Object o) {
		        
		return  this.acno==((A)o).acno &&
				this.bal==((A)o).bal;
	}

	@Override
	public int hashCode() {
		int hc=0;
		hc+=acno;
		hc+=bal;
		return hc;
	}
	
	

}
