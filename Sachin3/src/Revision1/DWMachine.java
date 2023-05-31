package Revision1;
interface Withdraw{
	void withdraw();
}
interface Deposit{
	void deposit();
}
public class DWMachine implements Withdraw,Deposit{
	public void withdraw() {
		System.out.println("withdraw");
	}
	public void deposit() {
		System.out.println("deposit");
	}
}
