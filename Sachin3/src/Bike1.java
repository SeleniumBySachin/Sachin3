
public class Bike1 {
     String brand;
     double price;
     String colour;
     Bike1(){}
	@Override
	public String toString() {
		return "Bike1 [brand=" + brand + ", price=" + price + ", colour=" + colour + "]";
	}
	public Bike1(String brand, double price, String colour) {
		super();
		this.brand = brand;
		this.price = price;
		this.colour = colour;
	}
}
