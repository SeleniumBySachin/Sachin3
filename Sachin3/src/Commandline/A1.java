package Commandline;

public class A1 {
	public static void main(String[] args) {
		for(int i=0;i<args.length;i++) {
			System.out.println(args[i]+"==>"+args[i].length());
		}
	}

}
