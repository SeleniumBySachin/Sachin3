package Threads;

public class Pen extends Thread{
	String name;
	Pen(){}
	Pen(String name){
		this.name=name;
	}
	void test() throws InterruptedException {
		for(int i=0;i<4;i++) {
			System.out.println("Name :"+name);
			Thread.sleep(1000);
		}
	}
	public void run() {
		try {
			test();
		}
		catch(InterruptedException e) {
			System.out.println("Exception handled");
		}
	}

}
