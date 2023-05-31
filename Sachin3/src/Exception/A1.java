package Exception;

public class A1 {
   public static void main(String[] args) {
	try {
		int a=20;
		int b=0;
		int res=a/b;
		System.out.println(res);
		
	}
	catch(ArithmeticException e) {
		System.out.println("Pleae do not pass the zero to denominator");
		
	}
	catch(ArrayIndexOutOfBoundsException e) {
		System.out.println("Array Exception is handled");
		
	}
	catch(StringIndexOutOfBoundsException e) {
		System.out.println("String Exception is handled");
		
	}
	catch(Exception e) {
		System.out.println("Array Exception is handled");
		
	}
	
}
}
