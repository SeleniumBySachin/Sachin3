package Practice1;

import java.util.HashSet;
import java.util.Iterator;

class Car{
	String name;
	double price;
	Car(){}
	@Override
	public String toString() {
		return "Car [name=" + name + ", price=" + price + "]";
	}
	public Car(String name, double price) {
		super();
		this.name = name;
		this.price = price;
	}
}
public class A8 {
	public static void main(String[] args) {
		HashSet <Car>s=new HashSet<>();
		s.add(new Car("BMW",20000));
		s.add(new Car("Suzuki",15000));
		s.add(new Car("Honda",30000));
		s.add(new Car("Audi",40000));
		System.out.println(s);
	    Iterator i=s.iterator();
	     while(i.hasNext()) {
	    	 Car c=(Car)i.next();
	    	 if(c.name.equalsIgnoreCase("Audi")) {
	    		 s.remove(c);
	    	 } 
	     }
	     System.out.println(s);
	   
	   
	}

}
