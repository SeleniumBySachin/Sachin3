package StringBuider;

public class D1 {
	public static void main(String[] args) {
		StringBuilder s1=new StringBuilder(50);
		s1.append("SheelaLeeala");
		System.out.println(s1.capacity());
		s1.trimToSize();
		System.out.println(s1.capacity());
	}

}
