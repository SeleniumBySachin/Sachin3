package String;

public class D1 {
	public static void main(String[] args) {
		StringBuilder s1=new StringBuilder("Sheela");
		StringBuilder s2=new StringBuilder("Leela");
		StringBuilder s3=new StringBuilder("SheelaLeela");
		s1.append(s2);
		System.out.println(s1);
		System.out.println(s3);
	}

}
