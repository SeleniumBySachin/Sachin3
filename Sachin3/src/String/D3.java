package String;

public class D3 {
	public static void main(String[] args) {
		char[]ch={'S','h','e','e','l','a'};
		String s1=String.valueOf(ch);
		System.out.println(ch);
		System.out.println(s1);
		System.out.println(String.valueOf(ch));
		for(int i=0;i<s1.length();i++) {
			System.out.println(s1.charAt(i));
		}
	}

}
