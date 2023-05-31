package Exception;

public class A2 {
   public static void main(String[] args) {
	   	try {
	   		String s1=new String("Sheela");
			System.out.println(s1.charAt(6));
	   		
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
	   		System.out.println("Array Exception is handled");
	   		
	   	}
	   	
	   
	   }

}

