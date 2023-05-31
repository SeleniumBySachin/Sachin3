package Threads;

public class Car extends Thread {
	public void run() {
		try {
			print();
		}
		catch(InterruptedException e) {
			e.getStackTrace();
		}
	}
	String name;
	Car(){}
	Car(String name){
		this.name=name;
	}
	void print() throws InterruptedException {
		for(int i=0;i<5;i++) {
			System.out.println("Name is : "+name);
			Thread.sleep(1000);
		}
	}
	

}
