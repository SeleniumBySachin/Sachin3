package Revision;

public class P8 {
	int a=10;
	public static void main(String[] args) {
		P8 p=new P8();
		System.out.println(p.a);
		System.out.println("===========");
		p.test();
	}
	void test() {
		P8 p=new P8();
		System.out.println(a);
		System.out.println(this.a);
		System.out.println(p.a);
	}
//non static member in static context & static context in same class
}
