package StringBuider;

public class P5 {
	public static void main(String[] args) {
		StringBuilder s1=new StringBuilder();
		System.out.println(s1);
		System.out.println(s1.capacity());
		s1.append("SachinDarshanRjuChanna");
		System.out.println(s1);
		System.out.println(s1.capacity());
		s1.trimToSize();
		System.out.println(s1.capacity());
	}

}
