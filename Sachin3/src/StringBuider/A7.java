package StringBuider;

public class A7 {
	public static void main(String[] args) {
     StringBuilder s=new StringBuilder();
     System.out.println(s.capacity());
     s.append("Sachin");
     System.out.println(s.capacity());
     s.append("SachinDarshanChanna");
     System.out.println(s.capacity());
	}

}
