package String;

public class P {

	public static void main(String[] args) {
		String s1="Hello";
		String s2=new String("Hello");
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s1==s2);
		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());
		System.out.println(s1.hashCode()==s2.hashCode());
	}

}
