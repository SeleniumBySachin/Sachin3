package Revision1;

class A10{
	final static int a;
	static {
		a=10;
	}
	final static void test() {
		System.out.println("Hi");
	}
}
public class A9 extends A10{
	public static void main(String[] args) {
		System.out.println(a);
		test();
	}

}
