package ObjectClass;

public class A1 {

	public static void main(String[] args) {
      A a1=new A(101,1000,"Sheela");
      A a2=new A(101,1000,"Leela");
      System.out.println(a1==a2);
      System.out.println(a1.equals(a2));
      System.out.println(a1.hashCode());
      System.out.println(a2.hashCode());
      System.out.println(a1.hashCode()==a2.hashCode());
	}

}
