package ObjectClass;

public class S2 {

	public static void main(String[] args) {
        S1 s1=new S1(10,20);
        S1 s2=new S1(10,20,40);
        System.out.println(s1);
        System.out.println(s1==s2);
        System.out.println(s1.equals(s2));
        System.out.println(s1.hashCode());
        System.out.println(s2.hashCode());
        System.out.println(s1.hashCode()==s2.hashCode());
	}

}
