package Revision;

public class P7 {
	public static void main(String[] args) {
		P6 p=new P6();
		System.out.println(P6.a);
		System.out.println(p.a);
		P7 p1=new P7();
		p1.test();
	}
	void test() {
		P6 p=new P6();
		System.out.println(P6.a);
		System.out.println(p.a);
	}
	//static member in different class static context and non static context
}
