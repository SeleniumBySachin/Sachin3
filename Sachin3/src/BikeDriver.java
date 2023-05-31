import java.util.Arrays;

public class BikeDriver {

	public static void main(String[] args) {
      Bike []b1=new Bike[4];
      b1[0]=new Bike("Red",150000,"Harly");
      b1[1]=new Bike("White",125000,"TVS");
      b1[2]=new Bike("Block",140000,"Bajaj");
      b1[3]=new Bike("Green",85000,"BMW");
      System.out.println("Before sorting");
      for(int i=0;i<b1.length;i++) {
    	  System.out.println(b1[i]);
      }
      Arrays.sort(b1);
      System.out.println("After sorting");
      for(int i=0;i<b1.length;i++) {
    	  System.out.println(b1[i]);
	}
   }

}
