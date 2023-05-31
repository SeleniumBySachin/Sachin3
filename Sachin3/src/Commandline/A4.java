package Commandline;

public class A4 {
	public static void main(String[] args) {
		add(10,20);
		add(10,20,30);
		add(10,20,40,50);
		add(10,20,40,50,60,70);
	}
	public static void add(int ...a) {
		int sum=0;
		for(int i=0;i<a.length;i++) {
			sum=sum+a[i];
		}
		System.out.println(sum);
	}

}
