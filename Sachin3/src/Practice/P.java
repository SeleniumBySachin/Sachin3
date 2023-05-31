package Practice;

public class P {
	public static void main(String[] args) {
		String s1="Leela";
		char[]ch=new char[s1.length()];
		for(int i=0;i<ch.length;i++) {
			ch[i]=s1.charAt(i);
		}
		for(int i=0;i<ch.length;i++) {
			System.out.println(ch[i]);
		}
		
	}

}
