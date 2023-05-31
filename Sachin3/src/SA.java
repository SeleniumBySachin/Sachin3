
public class SA extends Accounts{
	double bal;
	SA(){}
	public SA(int acno,String name,String ifsc,double bal) {
		super(acno,name,ifsc);
		this.bal = bal;
	}
	@Override
	public String toString() {
		super.toString();
		return "Account balance is: "+bal;
	}
	

}
