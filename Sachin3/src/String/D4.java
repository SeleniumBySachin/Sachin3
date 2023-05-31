package String;

public class D4 {

	public static void main(String[] args) {
       char[]ch= {'L','e','e','l','a'};
       String s1="";
       for(int i=0;i<ch.length;i++) {
    	   s1=s1+ch[i];
       }
       for(int i=0;i<s1.length();i++) {
    	   System.out.println(s1.charAt(i));
       }
	}

}
