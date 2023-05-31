package Exception;

public class P {
	public static void main(String[] args) {
		try {
			int[]a=new int[4];
			System.out.println(a[4]);
		}
		catch(StringIndexOutOfBoundsException e) {
			System.out.println("String Exception is handled");
		}
		catch(ArithmeticException e) {
			System.out.println("Arithmetic Exception is handled");
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Array Exception is handled");
		}
		finally {
			System.out.println("Tqs for using the application");
		}
	}

}
