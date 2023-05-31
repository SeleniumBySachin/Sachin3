package array;

public class Car implements Comparable {
	double price;
	String brand;
	int no_wheels;

	public Car(double price, String brand, int no_wheels) {
		super();
		this.price = price;
		this.brand = brand;
		this.no_wheels = no_wheels;
	}
    void display() {
    	System.out.println("The car price is: "+price);
    	System.out.println("The car brand is: "+brand);
    	System.out.println("The car no_wheels is: "+no_wheels);
    	System.out.println("-------------------------");
    }
    public String toString() {
    	return brand+":"+price+":"+no_wheels;
    }
    public int compareTo(Object o) {
    	Car c1=(Car)o;
    	if (this.price>c1.price)
    		return 1;
        	else if (this.price<c1.price)
        		return -1;
        	else
    		return 0;
	}

}
