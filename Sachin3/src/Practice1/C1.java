package Practice1;

public class C1 {
	public static void main(String[] args) {
		int a=Integer.valueOf(args[2]);
		int b=Integer.valueOf(args[1]);
		int sum=0;
		for(int i=0;i<args.length;i++) {
			sum=a+b;
		}
		System.out.println(sum);
	}

}
