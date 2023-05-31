package Threads;

public class P1 implements Runnable{
	String name;
	P1(){}
	P1(String name){
		this.name=name;
		
	}
	void test() throws InterruptedException {
		for(int i=0;i<5;i++) {
		System.out.println("Name : "+name);
		Thread.sleep(1000);
		}
	}
	public void run() {
		try{
			test();
		}
		catch(InterruptedException e) {
			e.printStackTrace();
		}
	}
}
