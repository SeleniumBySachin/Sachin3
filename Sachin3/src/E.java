
public abstract class E {
	private int acno;
	private String name;
	E(){super();}
	public E(int acno, String name) {
		this();
		this.acno = acno;
		this.name = name;
	}
	int getAcno() {
		return acno;
	}
	String getName() {
		return name;
	}
	void setAcno(int acno) {
		this.acno=acno;
	}
	void setName(String name) {
		this.name=name;
	}
	void test() {
		System.out.println("The account no is: "+acno);
		System.out.println("The holder name is: "+name);
	}

}
