package array;

public class Laptop {
	int ram;
	double price;
	String brand;
	public Laptop(int ram, double price, String brand) {
		super();
		this.ram = ram;
		this.price = price;
		this.brand = brand;
	}
	void display() {
		System.out.println("The lap ram is: "+ram);
		System.out.println("The lap brand is: "+brand);
		System.out.println("The lap price is: "+price);
		System.out.println("------------------------");
	}
	@Override
	public String toString() {
		return ram+":"+price+":"+brand;
	}
	

}
