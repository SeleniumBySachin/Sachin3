
public class A4 {
	public static void main(String[] args) {
		String s="Hello";
		String s1=new String("Hello");
		String s2="Hello";
		System.out.println(s);
		System.out.println(s1);
		System.out.println(s==s1);
		System.out.println(s==s2);
		System.out.println(s.equals(s1));
		System.out.println(s.hashCode());
		System.out.println(s1.hashCode());
		System.out.println(s.hashCode()==s1.hashCode());
	}

}
 