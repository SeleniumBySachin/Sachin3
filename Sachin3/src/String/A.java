package String;

public class A {
	private String brand;
	int pid;
	double price;
	A(){}
	public A(String brand, int pid, double price) {
		super();
		this.brand = brand;
		this.pid = pid;
		this.price = price;
	}
	String getBrand() {
		return brand;
	}
	void setBrand(String brand) {
		this.brand=brand;
	}
	public String toString() {
		return "[brand: "+brand+" pid: "+pid+" price: "+price;
	}
	public boolean equals(Object o) {
		A a=(A)o;
		return this.price==a.price &&
				this.pid==a.pid &&
				this.brand==a.brand;
	}
	public int hashCode() {
		int hc=0;
		hc+=price;
		hc+=pid+brand.hashCode();
		return hc;
	}

}
