package Threads;

public class P {
	public static void main(String[] args) throws InterruptedException {
		System.out.println("Sheela");
		System.out.println(Thread.currentThread().getPriority());
		System.out.println(Thread.currentThread().getName());
		System.out.println(Thread.currentThread().getId());
		for(int i=0;i<5;i++) {
			System.out.println("Hi");
			Thread.sleep(1000);
		}
	}

}
