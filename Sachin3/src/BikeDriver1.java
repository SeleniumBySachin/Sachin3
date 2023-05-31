import java.util.Arrays;

public class BikeDriver1 {
	public static void main(String[] args) {
	      Bike1 []b1=new Bike1[4];
	      b1[0]=new Bike1("Red",150000,"Harly");
	      b1[1]=new Bike1("White",125000,"TVS");
	      b1[2]=new Bike1("Block",140000,"Bajaj");
	      b1[3]=new Bike1("Green",85000,"BMW");
	      System.out.println("Before sorting");
	      for(int i=0;i<b1.length;i++) {
	    	  System.out.println(b1[i]);
	      }
	      Arrays.sort(b1,new SortByBrand());
	      System.out.println("After sorting");
	      for(int i=0;i<b1.length;i++) {
	    	  System.out.println(b1[i]);
		}
	}
}
