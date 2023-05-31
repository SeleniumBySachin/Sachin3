package StringMehods;

public class GetByte {
	public static void main(String[] args) {
		String s1="Sachin";
		byte[]b1=new byte[s1.length()];
		for(int i=0;i<s1.length();i++) {
			b1[i]=(byte) s1.charAt(i);
		}
		for(int i=0;i<b1.length;i++) {
			System.out.println(b1[i]);
		}
		
	}

}
