package Pattern;

public class P4 {
	public static void main(String[] args) {
		int n=4;
		for(int i=0;i<n;i++) {
			int k=n;
			for(int j=0;j<n;j++) {
				System.out.print(k--+" ");
			}
			System.out.println();
		}
	}

}
