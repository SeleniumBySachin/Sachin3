package Practice;

import java.util.ArrayList;

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
public class Driver {
	public static void main(String[] args) {
		ArrayList ls=new ArrayList();
		ls.add(new Pen(10,"cello"));
		ls.add(new Pen(15,"Writometer"));
		ls.add(new Pen(20,"camlin"));
		System.out.println(ls);
         System.out.println(ls.size());
		for(int i=0;i<ls.size();i++) {
			Pen p1=(Pen)ls.get(i);
			if(p1.name=="cello") {
				ls.remove(i);
			}
		}
		System.out.println(ls);
	}

}
