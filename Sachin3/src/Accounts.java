
public class Accounts {
	int acno;
	String name;
	String ifsc;
	Accounts(){}
	public Accounts(int acno, String name, String ifsc) {
		super();
		this.acno = acno;
		this.name = name;
		this.ifsc = ifsc;
	}
	@Override
	public String toString() {
		return "Account holder name is: "+name+"\nBranch code is: "+ifsc+"\nAccount no is: "+acno;
	}

}
