package Revision;

public class P6 {
	static int a=10;
	public static void main(String[] args) {
		P6 p=new P6();
		System.out.println(a);
		System.out.println(p.a);
		System.out.println(P6.a);
		System.out.println("=========");
		p.add();
		
		
	}
	void add()
	{
		P6 p=new P6();
		System.out.println(a);
		System.out.println(P6.a);
		System.out.println(this.a);
		System.out.println(p.a);
		System.out.println("==========");
	}
	//static memeber inside static context and non static context

}
