package Exception;

public class A3 {
   public static void main(String[] args) {
	   	try {
	   		A3 a=null;
	   		System.out.println(a.hashCode());
	   		
	   	}
	   	catch(ArithmeticException e) {
	   		System.out.println("Exception is handled");
	   		
	   	}
	   	catch(ArrayIndexOutOfBoundsException e) {
	   		System.out.println("Array Exception is handled");
	   		
	   	}
	   	catch(StringIndexOutOfBoundsException e) {
	   		System.out.println("String Exception is handled");
	   		
	   	}
	   	catch(Exception e) {
	   		System.out.println("Exception is handled");
	   		
	   	}
	   	
	   
	   }

}

