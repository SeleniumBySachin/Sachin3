package Wrapper;

public class A6 {
	public static void main(String[] args) {
		/*Character ch=10;
		test(ch);*/
		test('A');
		
	}
	public static void test(char ch) {
		System.out.println("From char");
	}
	public static void test(Character ch) {
		System.out.println("From character");
	}
	public static void test(int a) {
		System.out.println("From int");
	}
	public static void test(Object ch) {
		System.out.println("From object");
	}

}
