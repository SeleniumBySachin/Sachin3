
public class Bike implements Comparable{
	String colour;
	double  price;
	String brand;
	Bike(){}
	public Bike(String colour, double price, String brand) {
		super();
		this.colour = colour;
		this.price = price;
		this.brand = brand;
	}
	@Override
	public String toString() {
		return "Bike [colour=" + colour + ", price=" + price + ", brand=" + brand + "]";
	}

	@Override
	public int compareTo(Object o) {
		Bike b=(Bike)o;
		if(this.price>b.price)
		return 1;
		if(this.price<b.price)
			return -1;
		else
			return 0;
	}
	

}
