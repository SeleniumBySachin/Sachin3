package Threads;

public class P2 {
	public static void main(String[] args) {
		Car p=new Car("Sheela");
		Car p1=new Car("Leela");
		Car p2=new Car("Dinga");
		p.start();
		p1.start();
		p2.start();

	}

}
