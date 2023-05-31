package StringBuider;

public class P6 {
	public static void main(String[] args) {
		StringBuilder s1=new StringBuilder(100);
		s1.append("SachinDarshan");
		System.out.println(s1.capacity());
		s1.trimToSize();
		System.out.println(s1.capacity());
	}

}
