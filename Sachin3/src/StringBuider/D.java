package StringBuider;

public class D {
	public static void main(String[] args) {
		StringBuilder s1=new StringBuilder();
		System.out.println(s1.capacity());
		s1.append("Sachin");
		System.out.println(s1.capacity());
		s1.trimToSize();
		System.out.println(s1.capacity());
	}

}
