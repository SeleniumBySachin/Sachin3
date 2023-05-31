package Revision1;
class A7{
	void test() {
		System.out.println("Hi");
	}
}
class A8 extends A7{
	public void test() {
		super.test();
		System.out.println("Bye");
	}
}
public class A6 {
	public static void main(String[] args) {
		A8 obj=new A8();
		obj.test();
		A7 obj1=obj;
		obj1.test();
		A8 obj2=(A8)obj;
		obj2.test();
	}

}
