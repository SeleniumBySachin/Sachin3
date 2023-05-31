package Revision1;
class A4{
	static int a=10;
	static void test() {
		System.out.println("Hi");
	}
	
}
class A5 extends A4{
	static int a=20;
	static void test() {
		System.out.println("Bye");
	}
}
public class A3 {
	public static void main(String[] args) {
		  A5 obj=new A5();
		  System.out.println(obj.a);
		  A4 obj1=(A4)obj;
		  System.out.println(obj1.a);
		  obj.test();
		  obj1.test();
	}

}
