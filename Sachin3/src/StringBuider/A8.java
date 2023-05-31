package StringBuider;

public class A8 {
	public static void main(String[] args) {
		StringBuilder s=new StringBuilder();
		s.append("SachinDarshan");
		s.trimToSize();
		System.out.println(s);
		System.out.println(s.capacity());
	}
}