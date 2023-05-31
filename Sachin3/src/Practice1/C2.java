package Practice1;

public class C2 {
	public static void main(String[] args) {
		System.out.println(args.length);
		for(int i=0;i<args.length;i++) {
			System.out.print(args[i]+" & length is : ");
			System.out.println(args[i].length());
		}
	}

}
