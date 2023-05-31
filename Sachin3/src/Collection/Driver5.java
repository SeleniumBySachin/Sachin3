package Collection;

import java.util.HashSet;
import java.util.Iterator;

class Projector{
	String brand;
	double price;
	Projector(){}
	@Override
	public String toString() {
		return "Projector [brand=" + brand + ", price=" + price + "]";
	}
	public Projector(String brand, double price) {
		super();
		this.brand = brand;
		this.price = price;
	}
}
public class Driver5 {
	public static void main(String[] args) {
		HashSet<Projector>ls=new HashSet<>();
		ls.add(new Projector("Epson",40000));
		ls.add(new Projector("Samsung",38000));
		ls.add(new Projector("Sony",35000));
		System.out.println(ls);
		System.out.println("==================");
		for(Projector o:ls) {

			System.out.println(o);
		}
		Iterator i=ls.iterator();
		while(i.hasNext()) {
			Projector p1=(Projector)i.next();
			if(p1.brand.equalsIgnoreCase("Sony")) {
				i.remove();
			}
		}
		System.out.println("================");
		System.out.println(ls);
	}

}
