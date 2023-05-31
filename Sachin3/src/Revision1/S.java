package Revision1;
class S1{
	void test() {
		System.out.println("Hi");
	}
}
interface S2{
	void test();
}
public class S extends S1 implements S2{
	public void test() {
		super.test();
		System.out.println("Bye");
	}
	public static void main(String[] args) {
		S obj=new S();
		obj.test();
		S2 obj1=obj;
		obj1.test();
	}

}
