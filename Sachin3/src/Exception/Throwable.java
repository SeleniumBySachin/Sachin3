package Exception;

public class Throwable {
	public static void main(String[] args) {
		try {
			Throwable obj=null;
			System.out.println(obj.hashCode());
		}
		catch(NullPointerException e) {
			String s=e.getMessage();
			System.out.println(s);
			e.printStackTrace();
		}
	}

}
