package Revision1;

public class Driver1 {
	public static void main(String[] args) {
		DWMachine obj=new DWMachine();
		obj.withdraw();
		obj.deposit();
		System.out.println("==============");
		Deposit obj1=obj;
		Withdraw obj2=(Withdraw)obj1;
		obj2.withdraw();
		Deposit obj3=(Deposit)obj2;
		obj3.deposit();
		
		
	}

}
