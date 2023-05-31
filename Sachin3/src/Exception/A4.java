package Exception;

public class A4 {
	public static void main(String[] args){
		try {
			Thread.sleep(2000);
			System.out.println("Hi");
		}
		catch(Exception e) {
			System.err.println("Bye");
		}
	}
}