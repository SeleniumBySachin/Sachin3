package array;

public class P implements Comparable{
        
		double price;
        String brand;
        int no_wheels;
        
	public P(double price, String brand, int no_wheels) {
			super();
			this.price = price;
			this.brand = brand;
			this.no_wheels = no_wheels;
		}
	void display() {
		System.out.println("The car price: "+price);
		System.out.println("The brand of the car: "+brand);
		System.out.println("The no wheels: "+no_wheels);
	}
     public String toString() {
    	  return brand+":"+price;
      }
      @Override
  	public int compareTo(Object o) {
    	  P p1=(P)o;
    	 if(this.price>p1.price)
  		return 1;
    	  else if(this.price>p1.price)
    	  		return -1;
    	  else
    		  return 0;
    	  
  	}
	
}
