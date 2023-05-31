package Commandline;

public class A {
	public static void main(String[] args) {
		System.out.println(args);
		System.out.println(args.length);
		System.out.println("Addition of two no");
		int sum=0;
		for(int i=0;i<args.length;i++) {
			int a=Integer.parseInt(args[i]);
			sum=sum+a;
		}
		System.out.println("The sum of two no is: "+sum);
	}
}
