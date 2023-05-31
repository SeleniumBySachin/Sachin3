package Practice1;

public class C {
	public static int a=10;
	public static void main(String[] args) {
		System.out.println(args);
		System.out.println(args.length);
		int sum=0;
		for(int i=0;i<args.length;i++) {
			int a=Integer.valueOf(args[i]);
			sum+=a;
		}
		System.out.println(sum);
	}

}
