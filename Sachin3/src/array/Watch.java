package array;

public class Watch{
	String brand;
	double price;
	String colour;
	Watch(){}
	public Watch(String brand, double price, String colour) {
		super();
		this.brand = brand;
		this.price = price;
		this.colour = colour;
	}
	@Override
	public String toString() {
		return brand+":"+price+":"+colour;
	}

}
