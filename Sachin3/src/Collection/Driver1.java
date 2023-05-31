package Collection;

import java.util.ArrayList;
import java.util.Iterator;

class Pen{
	int price;
	String name;
	Pen(){}
	public Pen(int price, String name) {
		super();
		this.price = price;
		this.name = name;
	}
	public String toString() {
		return "Brand name :"+name+" ,Pen price :"+price; 
	}


}
public class Driver1 {
	public static void main(String[] args) {
		ArrayList ls=new ArrayList();
		ls.add(new Pen(10,"cello"));
		ls.add(new Pen(15,"Writometer"));
		ls.add(new Pen(20,"camlin"));
		System.out.println(ls);
		System.out.println(ls.size());
		System.out.println("---------------");
		for(int i=0;i<ls.size();i++){
			Pen p1=(Pen)ls.get(i);
			if(p1.name.equalsIgnoreCase("camlin")) {
				ls.remove(i);
				ls.add(new Pen(25,"Nataraj"));
				System.out.println(p1.price*1.3);
				System.out.println(ls.get(ls.size()-1));
			}
		}
		System.out.println(ls);
	}

}
