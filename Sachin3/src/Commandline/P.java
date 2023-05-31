package Commandline;

public class P {
	public static void main(String[] args) {
		add(10,20);
		add(10,20,30);
		add(10,20,10,40);
		
	}
	public static void add(int a,int b) {
		int sum=a+b;
		System.out.println(sum);
		System.out.println("-------------------");
	}
	public static void add(int ...a) {
		int sum=0;
		for(int i=0;i<a.length;i++) {
			sum=sum+a[i];
		}
		System.out.println(sum);
		
	}

}
