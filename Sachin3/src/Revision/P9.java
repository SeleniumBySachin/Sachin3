package Revision;

public class P9 {
	public static void main(String[] args) {
		P8 p=new P8();
		System.out.println(p.a);
		System.out.println("======");
		P9 p1=new P9();
		p1.test();
	}
	void test() {
		P8 p=new P8();
		System.out.println(p.a);
	}
//non static member in static context and static context in different class
}
