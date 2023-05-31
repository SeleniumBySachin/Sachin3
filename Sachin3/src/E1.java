
public class E1 {

	public static void main(String[] args) {
		E e1=new E2(101,"Sheela",12000);
		
     
      System.out.println(e1.getAcno());
      e1.setAcno(102);
      System.out.println(e1.getAcno());
      System.out.println(e1.getName());
      e1.setName("Leela");
      System.out.println(e1.getName());
      System.out.println("-------------------");
      e1.test();
      System.out.println(((E2)e1).price);
	}

}
