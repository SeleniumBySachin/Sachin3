package array;

import java.util.Comparator;

public class Watch1 implements Comparator{
	int pid;
	double price;
	String brand;
	Watch1(){}
	public Watch1(int pid, double price, String brand) {
		super();
		this.pid = pid;
		this.price = price;
		this.brand = brand;
	}
	public String toString() {
		return brand+":"+price+":"+pid;
	}
	@Override
	public int compare(Object o1, Object o2) {
		Watch1 w1=(Watch1)o1;
		Watch1 w2=(Watch1)o2;
		
			if(w1.price>w2.price) {
				return 1;
			}
			if(w1.price<w2.price) {
				return -1;
			}
			else
			return 0;
		
	}
	
	

}
