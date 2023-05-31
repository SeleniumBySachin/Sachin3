package Collection;

import java.util.ArrayList;

class Watch{
	String brand;
	String colour;
	double price;
	Watch(){}
	public Watch(String brand, String colour, double price) {
		super();
		this.brand = brand;
		this.colour = colour;
		this.price = price;
	}
	@Override
	public String toString() {
		return "Watch [brand=" + brand + ", colour=" + colour + ", price=" + price + "]";
	}
	
}
public class P {
	public static void main(String[] args) {
		ArrayList ls=new ArrayList();
		ls.add(new Watch("Titan","Black",2000));
		ls.add(new Watch("Sonata","Blue",2500));
		ls.add(new Watch("Fastrack","Greay",3000));
		System.out.println(ls);
		for(int i=0;i<ls.size();i++) {
			Watch w1=(Watch)ls.get(i);
			if(w1.brand.equalsIgnoreCase("sonata")) {
				ls.remove(w1);
				
			}
			System.out.println(w1.price*1.3);
		}
		System.out.println(ls.get(ls.size()));
		System.out.println(ls);
		
	}

}
