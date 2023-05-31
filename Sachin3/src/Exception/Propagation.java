package Exception;

public class Propagation {
	public static void test() {
		System.out.println("From test");
		int a=20;
		int b=0;
		int res=a/b;
		System.out.println(res);
		System.out.println("Test end");
		
	}
	public static void main(String[] args) {
		System.out.println("From main");
		print();
		System.out.println("Main end");
	}
	public static void print() {
		System.out.println("From print");
		test();
		System.out.println("Print end");
	}

}
