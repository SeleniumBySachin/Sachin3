package Pattern;

public class P9 {
	public static void main(String[] args) {
		int n=4;
		char k='D';
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				System.out.print(k+" ");
			}
			System.out.println();
			k--;
		}
	}

}
